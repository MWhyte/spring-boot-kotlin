# spring-boot-kotlin

Learning about spring boots support for Kotlin 

Including:
- Basic DI / Autowiring
- Rest Controllers
- Logging
- Tracing (zipkin)
- Support for RestTemplate / JUnit 5 / Hamcrest
- Swagger Docs


---
 
#####  Swagger Doc's

You can view available rest endpoints using swagger:
[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

--- 

##### External dependencies
###### Zipkin
An instance of zipkin is required to avoid errors on start up and to
support tracing.

Install via docker:

`docker run -d -p 9411:9411 openzipkin/zipkin`

Other methods on the [zipkin](https://zipkin.io/pages/quickstart) website
