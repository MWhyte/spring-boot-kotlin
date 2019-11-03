# spring-boot-kotlin

Learning about spring boots support for Kotlin 

Including:
- Basic DI / Autowiring
- Rest Controllers
- Logging
- Tracing
- Support for RestTemplate / JUnit 5 / Hamcrest

---

##### External dependencies
###### Zipkin
An instance of zipkin is required to avoid errors on start up and to
support tracing.

Install via docker:

`docker run -d -p 9411:9411 openzipkin/zipkin`

Other methods on the [zipkin](https://zipkin.io/pages/quickstart) website
