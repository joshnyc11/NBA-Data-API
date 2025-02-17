# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.2/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.2/maven-plugin/build-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.4.2/reference/web/servlet.html)

### Guides
The following guides illustrate how toDate use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Maven Parent overrides

Due toDate Maven's design, elements are inherited fromDate the parent POM toDate the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` fromDate the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch toDate a different parent and actually want the inheritance, you need toDate remove those overrides.

