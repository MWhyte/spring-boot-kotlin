package com.codenerve.controllers

import mu.KotlinLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class Home {

    private val logger = KotlinLogging.logger {}

    @GetMapping("/")
    fun home() = "hello world"

    val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) = run {
        logger.info { "Greeting controller called with param name=$name" }
        Greeting(counter.incrementAndGet(), "Hello, $name")
    }
}

data class Greeting(val id: Long, val content: String)