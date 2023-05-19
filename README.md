# Spring Boot CRUD

### Architecture

![](https://media.geeksforgeeks.org/wp-content/uploads/20190822182410/Spring-Boot-flow-architecture.jpg)

### Spring vs Spring Boot

![](https://umuzi-org.github.io/tech-department/topics/java-specific/introduction-to-spring-boot/part-1/spring-vs-springboot.png)

### Dependency Injection

![](https://media.geeksforgeeks.org/wp-content/uploads/20190418110409/Spring-Dpendency-Injection.png)

#### Advantages of Spring Boot:

* Easy setup: Spring Boot provides a streamlined way to create and configure Spring applications. It reduces the
  boilerplate configuration required and offers auto-configuration, allowing developers to get started quickly.
* Convention over configuration: Spring Boot follows the principle of convention over configuration, meaning that it
  provides sensible defaults and automatic configurations based on best practices. Developers can focus on writing
  business logic instead of spending time on manual configuration.
* Embedded servers: Spring Boot includes embedded servers (e.g., Tomcat, Jetty, Undertow) that allow you to run your
  application as a standalone JAR file without the need to deploy it to a separate server. This makes it convenient for
  packaging and deploying applications.
* Dependency management: Spring Boot manages dependencies for you using its starter dependencies. You can declare
  dependencies in your pom.xml file or build.gradle file, and Spring Boot takes care of resolving and managing the
  versions of those dependencies, reducing dependency conflicts.
* Production-ready features: Spring Boot provides a range of production-ready features through Spring Boot Actuator. It
  includes monitoring, health checks, metrics, and management endpoints, which facilitate operational tasks such as
  monitoring the application's health and managing its configuration.
* Spring ecosystem: Spring Boot leverages the vast ecosystem of Spring projects and libraries. It integrates well with
  other Spring modules like Spring Data, Spring Security, and Spring Cloud, making it easy to build enterprise-grade
  applications.

#### Disadvantages of Spring Boot:

* Learning curve: While Spring Boot simplifies application development, it is still built on top of the Spring
  Framework, which has a learning curve. Developers need to have a solid understanding of Spring concepts and best
  practices to utilize Spring Boot effectively.
* Indirect configuration: Spring Boot's auto-configuration magic may sometimes lead to unexpected behavior if developers
  are not aware of how the underlying configurations work. It's important to understand how auto-configuration works and
  be able to override or customize it when needed.
* Increased memory footprint: Spring Boot's auto-configuration and embedded servers come at the cost of increased memory
  usage compared to a more lightweight framework. If memory usage is a critical concern for your application, you may
  need to consider other lightweight alternatives.
* Reduced control over configurations: While Spring Boot provides sensible defaults and automatic configurations, it may
  limit fine-grained control over certain aspects of your application. If you have specific requirements that deviate
  from the defaults, you may need to invest more effort in customization.

## Swagger

> http://localhost:8081/swagger-ui/

> http://localhost:8081/v2/api-docs

## Actuators

> http://localhost:8081/actuator/info

> http://localhost:8081/actuator/health

## H2 DB

> http://localhost:8081/h2-console/