# 使用Java SPI实现可扩展应用

### 1、关于SPI（服务提供者接口）

Java 6 引入了一个功能：服务提供者接口（SPI），用于发现和加载与给定接口匹配的实现。
引入SPI是为了使应用程序更具可扩展性。它为我们提供了一种在不修改核心应用程序代码的情况下扩展产品特定部分的方法。使用 SPI 机制，应用程序将加载新的实现并使用它。
Java SPI 定义了四个主要组件
- 服务

> 一组编程接口和类，提供对某些特定应用程序功能或特性的访问定义。
- 服务提供者接口

> 充当服务的代理或服务端点的接口或抽象类。
- 服务提供者

> SPI 的特定实现。服务提供程序包含一个或多个实现或扩展服务类型的具体类。
- 服务加载程序

> SPI 的核心是服务加载程序，用于延迟发现和加载服务实现。它使用上下文类路径来查找提供程序实现并将它们放在内部缓存中，服务加载程序维护已加载服务的缓存。每次我们调用服务加载器来加载服务时，它首先按实例化顺序列出缓存的元素，然后发现并实例化所需未实例化的提供程序。

Java 包含许多不同的服务提供者接口，其中之一是用于加载数据库驱动程序的驱动接口。


### 2、开发环境

当前项目使用以下开发环境：
- 操作系统：Windows 11
- JDK 17
- 数据库：PostgreSQL 15.2
- IDE：VS Code（版本1.83.1），并安装以下插件：
  1. Extension Pack for Java
  1. Spring Boot Extension Pack

### 3、创建Maven多模块项目

为使用SPI实现扩展应用，将使用Maven多模块项目构建。
- api：服务模块
- provider：服务提供者模块
- app：服务加载程序模块
