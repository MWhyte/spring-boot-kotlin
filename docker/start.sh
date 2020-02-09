#!/usr/bin/env bash

docker run -d -p 9411:9411 --name zipkin openzipkin/zipkin
docker run -d -p 9090:9090 -v /Users/mrwhyte/Dropbox/Development/Code/Kotlin/kotlin-microservice/docker/prometheus.yml:/etc/prometheus/prometheus.yml --name prometheus prom/prometheus
docker run -d -p 3000:3000 --name grafana grafana/grafana

./seeall.sh;