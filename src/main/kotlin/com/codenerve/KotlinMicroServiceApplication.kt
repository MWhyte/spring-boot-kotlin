package com.codenerve

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinMicroServiceApplication

fun main(args: Array<String>) {
    runApplication<KotlinMicroServiceApplication>(*args)
}
