package com.codenerve.services

import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class MockServices {

    val restTemplate: RestTemplate = RestTemplate()

    fun allEmployees(): List<Employee> {
        //TODO
        return emptyList()
    }

    fun getEmployeeById(id: String) {
        //TODO
    }

    data class Employee(val id: Long,
                        val employeeName: String,
                        val employeeSalary: String,
                        val employeeAge: String,
                        val profileImage: String)
}