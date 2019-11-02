package com.codenerve.services

import org.springframework.stereotype.Service

@Service
class EmployeeService {

    fun getEmployeeByName(id: String) : Employee {
        return Employee(1, "Michael Whyte", 100000, 35, "some picture")
    }

    data class Employee(val id: Long,
                        val employeeName: String,
                        val employeeSalary: Int,
                        val employeeAge: Int,
                        val profileImage: String)
}