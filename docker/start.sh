#!/usr/bin/env bash

PROJECT_DIR=/Users/mrwhyte/Dropbox/Development/Code/Kotlin/kotlin-microservice

docker run -d -p 9411:9411 --name zipkin openzipkin/zipkin
docker run -d -p 9090:9090 -v ${PROJECT_DIR}/docker/config/prometheus.yml:/etc/prometheus/prometheus.yml --name prometheus prom/prometheus
docker run -d -p 3000:3000 --name grafana grafana/grafana

docker ps -a