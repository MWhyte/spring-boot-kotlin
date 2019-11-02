package com.codenerve.services

import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class MockServices {

    val restTemplate: RestTemplate = RestTemplate()

    fun allEmployees(): List<String> {
        //TODO
        return emptyList()
    }


    fun getEmployeeById(id: String) {
        //TODO
    }

}