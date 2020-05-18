# spring-boot-kotlin

Learning about spring boots support for Kotlin 

Including:
- Basic DI / Autowiring
- Rest Controllers
- Logging
- Tracing (zipkin)
- Support for RestTemplate / JUnit 5 / Hamcrest
- Swagger Docs
- Prometheus
- Grafana

---
 
#####  Swagger Doc's

You can view available rest endpoints using swagger:
[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)


--- 

##### External dependencies

docker is required

See ```<project_root>/docker/start.sh``` to setup external dependencies:

- Zipkin server
- Prometheus
- Grafana
    - N.B. setting up grafana is currently manual and uses a dashboard template (id=10280) which can easily be imported.
    
    
##### Running local

- run ```<project_root>/docker/start.sh``` and ensure
- run ```KotlinMicroServiceApplication``` from your IDE or CMD line.
- run ```<project_root>/docker/open.sh``` to open relevant urls in your default browser
