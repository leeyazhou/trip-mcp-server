# Trip MCP Server

## 项目简介

Trip MCP Server 是一个基于 Spring Boot 3.x 和 Model Context Protocol (MCP) 的服务端项目，用于处理模型上下文协议相关的服务。

## 功能特性

* 基于 Spring Boot 3.5.0
* 支持 Model Context Protocol (MCP)
* 集成 Spring AI
* 模块化架构设计

## 技术栈

* Java 17
* Spring Boot 3.5.0
* Spring AI 1.0.0
* MCP SDK 0.10.0
* Maven

## 快速开始

### 环境要求

* JDK 17+
* Maven 3.8+

### 构建项目

```bash
mvn clean install
```

### 运行项目

```bash
mvn spring-boot:run
```

### 测试

#### 1. 生产AccessToken

```
curl -XPOST http://localhost:8081/oauth2/token --data grant_type=client_credentials --user mcp-client:secret

# response: 
```

#### 2. 访问

```
curl http://localhost:8080/sse -H"Authorization: Bearer YOUR_ACCESS_TOKEN"
#
# 响应：
#
# id:918d5ebe-9ae5-4b04-aae8-c1ff8cdbb6e0
# event:endpoint
# data:/mcp/message?sessionId=918d5ebe-9ae5-4b04-aae8-c1ff8cdbb6e0
```

## 项目结构

```
trip-mcp-server/
├── trip-mcp-server-starter/     # 启动模块
├── trip-mcp-server-app/         # 应用模块
├── trip-mcp-server-infrastructure/  # 基础设施模块
└── trip-mcp-server-client/      # 客户端模块
```

## 贡献指南

1. Fork 本仓库
2. 创建你的特性分支 (`git checkout -b feature/AmazingFeature`)
3. 提交你的更改 (`git commit -m 'Add some AmazingFeature'`)
4. 推送到分支 (`git push origin feature/AmazingFeature`)
5. 开启一个 Pull Request

## 版本历史

* 0.0.1-SNAPSHOT - 初始版本

## 许可证

本项目采用 [LICENSE](LICENSE) 许可证 - 查看 [LICENSE](LICENSE) 文件了解详情

## 安全

如果您发现任何安全漏洞，请查看 [SECURITY.md](SECURITY.md) 了解如何报告。
