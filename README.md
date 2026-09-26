# AcceleratedRendering-Ported

Fabric **1.21.11** port of **Accelerated Rendering** — fast entity rendering acceleration with compute-shader based vertex transform and mesh caching.

[English](#english) | [中文](#中文)

---

## 中文

### 简介

这是 **Accelerated Rendering** 的 Fabric 1.21.11 移植版本。原模组由 **Argon4W** 开发，主要使用计算着色器加速实体渲染中的顶点变换与网格缓存。

本仓库为 Fabric 1.21.11 的移植分支，包含源代码与发布版本。

### 功能

- 实体渲染加速
- 阴影加速
- 基于计算着色器的顶点变换与网格缓存
- Fabric 1.21.11 支持

> 部分兼容性 Mixin（如部分实体/Banner/FeatureDispatcher 路径）在当前版本中默认关闭，核心实体、阴影与物品加速可用。

### 环境要求

| 依赖 | 版本 |
|---|---|
| Minecraft | 1.21.11 |
| Fabric Loader | >= 0.19.5 |
| Fabric API | >= 0.139.0 |
| Forge Config API Port | 21.11.1 |
| Java | >= 21 |

可选依赖：

- Iris（光影）
- Sodium
- Mod Menu

### 安装

1. 安装支持 Minecraft 1.21.11 的 Fabric Loader。
2. 将 `acceleratedrendering-1.0.15-1.21.11-alpha-fabric.1.jar` 放入 `.minecraft/mods`。
3. 安装 Fabric API 与 Forge Config API Port。
4. 启动游戏。

### 下载

- GitHub Releases：
  https://github.com/DJL606/AcceleratedRendering-Ported/releases

### 致谢

- 原模组：Argon4W
  https://github.com/Argon4W/AcceleratedRendering
- Fabric 移植参考：ZhuRuoLing
  https://github.com/ZhuRuoLing
- Fabric 1.21.11 移植与维护：DJL606 / namelessgod2008

### 许可证

本项目采用双重许可：

- 原模组 Accelerated Rendering（Copyright Argon4W）：MIT License
- Fabric 移植新增部分（Copyright DJL606, namelessgod2008）：CC BY-NC 4.0（非商业使用）

详见 [LICENSE](LICENSE)。

---

## English

### About

This is a Fabric **1.21.11** port of **Accelerated Rendering**, originally created by **Argon4W**. The mod accelerates entity rendering with compute-shader based vertex transform and mesh caching.

### Features

- Entity rendering acceleration
- Shadow acceleration
- Compute-shader based vertex transform and mesh caching
- Fabric 1.21.11 support

> Some optional compatibility mixins are disabled in this port. Core entity, shadow and item acceleration paths are available.

### Requirements

| Dependency | Version |
|---|---|
| Minecraft | 1.21.11 |
| Fabric Loader | >= 0.19.5 |
| Fabric API | >= 0.139.0 |
| Forge Config API Port | 21.11.1 |
| Java | >= 21 |

Optional:

- Iris
- Sodium
- Mod Menu

### Installation

1. Install Fabric Loader for Minecraft 1.21.11.
2. Put `acceleratedrendering-1.0.15-1.21.11-alpha-fabric.1.jar` into `.minecraft/mods`.
3. Install Fabric API and Forge Config API Port.
4. Launch the game.

### Download

- GitHub Releases:
  https://github.com/DJL606/AcceleratedRendering-Ported/releases

### Credits

- Original mod: Argon4W
  https://github.com/Argon4W/AcceleratedRendering
- Fabric port reference: ZhuRuoLing
  https://github.com/ZhuRuoLing
- Fabric 1.21.11 port and maintenance: DJL606 / namelessgod2008

### License

This project uses dual licensing:

- Original mod Accelerated Rendering (Copyright Argon4W): MIT License
- Fabric port contributions (Copyright DJL606, namelessgod2008): CC BY-NC 4.0 (non-commercial)

See [LICENSE](LICENSE) for details.
