package com.namelessgod2008.features.items.mixins;

import com.namelessgod2008.core.CoreFeature;
import com.namelessgod2008.core.buffers.accelerated.builders.VertexConsumerExtension;
import com.namelessgod2008.features.entities.AcceleratedEntityRenderingFeature;
import com.namelessgod2008.features.items.AcceleratedItemRenderingFeature;
import com.namelessgod2008.features.items.AcceleratedQuadsRenderer;
import com.namelessgod2008.features.items.colors.TintLayerColors;
import com.mojang.blaze3d.vertex.PoseStack;
import lombok.experimental.ExtensionMethod;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.item.ItemStackRenderState;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.world.item.ItemDisplayContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@ExtensionMethod(VertexConsumerExtension.class)
@Mixin(ItemRenderer.class)
public class ItemFeatureRendererMixin {

	@Inject(
			method		= "renderItem",
			at			= @At("HEAD"),
			cancellable	= true
	)
	private static void accelerateItem(
			ItemDisplayContext				displayContext,
			PoseStack						poseStack,
			MultiBufferSource				bufferSource,
			int								lightCoords,
			int								overlayCoords,
			int[]							tintLayers,
			List<BakedQuad>					quads,
			RenderType						renderType,
			ItemStackRenderState.FoilType	foilType,
			CallbackInfo					ci
	) {
		if (		!CoreFeature						.isLoaded						()
				||	!CoreFeature						.isRenderingLevel				()
				||	!AcceleratedEntityRenderingFeature	.isEnabled					()
				||	!AcceleratedEntityRenderingFeature	.shouldUseAcceleratedPipeline	()
				||	!AcceleratedItemRenderingFeature	.isEnabled					()
				||	foilType != ItemStackRenderState.FoilType.NONE
				||	quads.isEmpty()
		) {
			return;
		}

		var accelerated = bufferSource.getBuffer(renderType).getAccelerated();

		if (!accelerated.isAccelerated()) {
			return;
		}

		ci.cancel();

		var pose = poseStack.last();

		accelerated.doRender(
				AcceleratedQuadsRenderer.INSTANCE,
				AcceleratedQuadsRenderer.context(quads, new TintLayerColors(tintLayers)),
				pose.pose(),
				pose.normal(),
				lightCoords,
				overlayCoords,
				-1
		);
	}
}
