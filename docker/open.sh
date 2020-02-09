#!/usr/bin/env bash


# spring boot app
open http://localhost:8080/tax?name=michael
open http://localhost:8080/fast-tax?name=michael
open http://localhost:8080/actuator/prometheus

# zipkin
open http://localhost:9411

# prometheus
open http://localhost:9090

# grafana
open http://localhost:3000
# dash id 10280