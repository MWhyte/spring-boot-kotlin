package com.codenerve.controllers

import org.hamcrest.CoreMatchers.containsStringIgnoringCase
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.http.HttpStatus

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HomeTest(@Autowired val restTemplate: TestRestTemplate) {

    @Test
    fun `Assert Home page content and status code`() {
        println(">> Assert blog page title, content and status code")
        val entity = restTemplate.getForEntity<String>("/")

        assertThat(entity.statusCode, equalTo(HttpStatus.OK))
        assertThat(entity.body, containsStringIgnoringCase("Hello World"))
    }

    @Test
    fun `Assert Greeting content and status code`() {
        val name = "Michael"
        val entity = restTemplate.getForEntity<String>("/greeting?name=$name")

        assertThat(entity.statusCode, equalTo(HttpStatus.OK))
        assertThat(entity.body, containsStringIgnoringCase("Hello, $name"))
    }
}