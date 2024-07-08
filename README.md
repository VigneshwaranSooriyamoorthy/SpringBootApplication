# SpringBoot Application
This is a simple Spring Boot application prepared for basic learning purpose.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites
- Java 8 or later [Currently I am using Java 17]
- IDE (VS Code, IntelliJ, or any)
- Microsoft SQL Server

### Installation
#### Key VS Code extension
- Spring Boot
    - Spring Boot Dashboard
    - Spring Boot Extension Pack
    - Spring Boot Tools
    - Spring Initializr Java Support
- Java
    - Language Support for Java(TM) by Red Hat
    - Project Manager for Java
    - Extension Pack for Java
    - Debugger for Java
    - Maven for Java
- General
    - XML
    - IntelliCode
    - Code Runner
    - Prettier - Code formatter

### Usage
- Clone repository `git clone https://github.com/VigneshwaranSooriyamoorthy/SpringBootApplication.git`
- `mvn clean install` to syncronize all dependencies
- Open 'Spring Boot Dashboard'
- Run 'demo' application
- Navigate to http://localhost:8080 to access the webpage

## Product Structure
### Backend Service
- [Spring Boot application](./src/main/java/com/example/demo/DemoApplication.java)
- [Data injection](./src/main/java/com/example/demo/LoadSampleData.java)
- [Spring Boot Entity ~ DB table equivalent](./src/main/java/com/example/demo/User.java)
- [Rest endpoint controller](./src/main/java/com/example/demo/UserController.java)
- [Data repository handler](./src/main/java/com/example/demo/UserRepository.java)
- [Spring Boot property file](./src/main/resources/application.properties)

### Frontend
- [Webpage HTML](./src/main/resources/static/webpage/demo.html)
- [Support CSS](./src/main/resources/static/webpage/css/demo.css)
- [Support script](./src/main/resources/static/webpage/js/post-user-info.js)