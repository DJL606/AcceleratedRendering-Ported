# Changelog

## 1.0.15 — Fabric 1.21.11 (Alpha)

### 中文

- 首次发布 Fabric 1.21.11 移植版本。
- 基于 26.1 分支的新渲染架构，反向适配到 Minecraft 1.21.11。
- 修复 Fabric Loader / Fabric API / Forge Config API Port 依赖版本问题。
- 显式打包 Night Config，避免 Forge Config API Port 启动时缺少 `UnmodifiableConfig`。
- 未安装 Iris 时不再加载 Iris gbuffer 桥接，避免 `NoClassDefFoundError`。
- 已验证客户端可正常启动、进入世界，实体/阴影加速生效。

#### 必需依赖

- Minecraft 1.21.11
- Fabric Loader >= 0.19.5
- Fabric API >= 0.139.0
- Forge Config API Port 21.11.1

#### 可选依赖

- Mod Menu
- Iris
- Sodium

### English

- First Fabric 1.21.11 port release.
- Rebased on the 26.1 branch architecture and backported to Minecraft 1.21.11.
- Fixed Fabric Loader / Fabric API / Forge Config API Port version requirements.
- Bundled Night Config explicitly to avoid a startup `NoClassDefFoundError` from Forge Config API Port.
- Guarded the Iris gbuffer bridge when Iris is not installed.
- Verified the client starts and enters a world with entity/shadow acceleration active.

#### Required dependencies

- Minecraft 1.21.11
- Fabric Loader >= 0.19.5
- Fabric API >= 0.139.0
- Forge Config API Port 21.11.1

#### Optional dependencies

- Mod Menu
- Iris
- Sodium
