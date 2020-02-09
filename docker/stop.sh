#!/usr/bin/env bash

docker container stop zipkin
docker container stop prometheus
docker container stop grafana

docker container rm zipkin
docker container rm prometheus
docker container rm grafana

docker ps -a