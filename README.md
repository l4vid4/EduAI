# 基于SpringAI实现的专家系统
[![zread](https://img.shields.io/badge/Ask_Zread-_.svg?style=flat&color=00b0aa&labelColor=000000&logo=data%3Aimage%2Fsvg%2Bxml%3Bbase64%2CPHN2ZyB3aWR0aD0iMTYiIGhlaWdodD0iMTYiIHZpZXdCb3g9IjAgMCAxNiAxNiIgZmlsbD0ibm9uZSIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIj4KPHBhdGggZD0iTTQuOTYxNTYgMS42MDAxSDIuMjQxNTZDMS44ODgxIDEuNjAwMSAxLjYwMTU2IDEuODg2NjQgMS42MDE1NiAyLjI0MDFWNC45NjAxQzEuNjAxNTYgNS4zMTM1NiAxLjg4ODEgNS42MDAxIDIuMjQxNTYgNS42MDAxSDQuOTYxNTZDNS4zMTUwMiA1LjYwMDEgNS42MDE1NiA1LjMxMzU2IDUuNjAxNTYgNC45NjAxVjIuMjQwMUM1LjYwMTU2IDEuODg2NjQgNS4zMTUwMiAxLjYwMDEgNC45NjE1NiAxLjYwMDFaIiBmaWxsPSIjZmZmIi8%2BCjxwYXRoIGQ9Ik00Ljk2MTU2IDEwLjM5OTlIMi4yNDE1NkMxLjg4ODEgMTAuMzk5OSAxLjYwMTU2IDEwLjY4NjQgMS42MDE1NiAxMS4wMzk5VjEzLjc1OTlDMS42MDE1NiAxNC4xMTM0IDEuODg4MSAxNC4zOTk5IDIuMjQxNTYgMTQuMzk5OUg0Ljk2MTU2QzUuMzE1MDIgMTQuMzk5OSA1LjYwMTU2IDE0LjExMzQgNS42MDE1NiAxMy43NTk5VjExLjAzOTlDNS42MDE1NiAxMC42ODY0IDUuMzE1MDIgMTAuMzk5OSA0Ljk2MTU2IDEwLjM5OTlaIiBmaWxsPSIjZmZmIi8%2BCjxwYXRoIGQ9Ik0xMy43NTg0IDEuNjAwMUgxMS4wMzg0QzEwLjY4NSAxLjYwMDEgMTAuMzk4NCAxLjg4NjY0IDEwLjM5ODQgMi4yNDAxVjQuOTYwMUMxMC4zOTg0IDUuMzEzNTYgMTAuNjg1IDUuNjAwMSAxMS4wMzg0IDUuNjAwMUgxMy43NTg0QzE0LjExMTkgNS42MDAxIDE0LjM5ODQgNS4zMTM1NiAxNC4zOTg0IDQuOTYwMVYyLjI0MDFDMTQuMzk4NCAxLjg4NjY0IDE0LjExMTkgMS42MDAxIDEzLjc1ODQgMS42MDAxWiIgZmlsbD0iI2ZmZiIvPgo8cGF0aCBkPSJNNCAxMkwxMiA0TDQgMTJaIiBmaWxsPSIjZmZmIi8%2BCjxwYXRoIGQ9Ik00IDEyTDEyIDQiIHN0cm9rZT0iI2ZmZiIgc3Ryb2tlLXdpZHRoPSIxLjUiIHN0cm9rZS1saW5lY2FwPSJyb3VuZCIvPgo8L3N2Zz4K&logoColor=ffffff)](https://zread.ai/l4vid4/EduAI)

## 一、技术亮点
- Spring AI + Vector Store + RAG：使用 ETL → 嵌入 → 存储 → 检索 → 生成，确保模型能处理本地结构化数据。
- Tool Calling：自定义函数方法可被大模型自动识别调用，实现查询与展示分离。
- Vaadin UI：大模型可以调用vaadin的方法，实现操作前端页面。
- SpringAI + SpringBoot + MyBatis-Plus：实现大模型轻松访问数据库查询数据。

## 二、功能举例
### 学号／姓名查询学生信息
- 用户输入“查一下学号 20231234，姓名 张三 的信息”
- 聊天模型匹配 getStudentInfo 工具
- 后端函数调用数据库，返回包括姓名、专业、联系方式等基础信息
- 模型整合结果并输出

### 查询学生成绩并弹窗展示
- 用户请求“查一下 20231234 的成绩”
- 模型识别调用 getStudentGrades
- 服务读取成绩表数据，返回结构化结果
- 系统通过弹窗或前端组件直观展示成绩单

### 班级成绩分析图
- 用户询问“我想看 2023 级计算机班的成绩分析”
- 模型先检索相关班级成绩文档
- 调用 getClassAnalytics(classId)，生成平均分、分布图等数据
- 前端基于结果绘制图表，直观展示班级整体表现

## 三、环境要求
- Java 17+
- docker

## 四、快速开始

### 1、克隆项目到本地
```shell
git clone https://github.com/l4vid4/EduAI.git
```
### 2、选择模型并引入依赖和配置
#### OpenAI
- pom中引入依赖:
```xml
<dependency>
    <groupId>org.springframework.ai</groupId>
    <artifactId>spring-ai-openai-spring-boot-starter</artifactId>
</dependency>
```
- 配置文件`applicaiton.properties`中填写api_key和选择的模型:
```
spring.ai.openai.api-key=${OPENAI_API_KEY}
spring.ai.openai.chat.options.model=gpt-4o
```

#### 智普AI
- pom中有引入依赖：
```xml
<dependency>
  <groupId>org.springframework.ai</groupId>
  <artifactId>spring-ai-starter-model-zhipuai</artifactId>
</dependency>
```
- 添加智普AI的配置
```properties
spring.ai.zhipuai.api-key=
spring.ai.zhipuai.chat.options.model=glm-4-long
```
### 3、修改 resources/rag 文件夹下的 RAG 文件，配置知识库

### 4、使用 Docker 运行向量数据库：
```
docker run -it --rm --name postgres -p 5432:5432 -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres ankane/pgvector
```
### 5、启动项目
运行 Application.java 即可
