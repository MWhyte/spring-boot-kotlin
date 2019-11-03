package com.codenerve.controllers

import com.codenerve.models.Greeting
import com.codenerve.services.EmployeeService
import com.codenerve.services.EmployeeService.Employee
import com.codenerve.services.PayrollService
import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class Home @Autowired constructor(private val employeeService: EmployeeService,
                                  private val payrollService: PayrollService) {

    private val logger = KotlinLogging.logger {}
    val counter = AtomicLong()

    @GetMapping("/")
    fun home() = "hello world"

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): Greeting {
        logger.info { "Greeting controller called with param name=$name" }
        return Greeting(counter.incrementAndGet(), "Hello, $name")
    }

    @GetMapping("/tax")
    fun getTaxByEmployeeId(@RequestParam(value = "name") name: String): Double {

        val employee: Employee = employeeService.getEmployeeByName(name)

        // these two methods calls could be run asynchronously
        val taxAllowance = payrollService.getTaxAllowanceByEmployeeId(employee.id)
        val taxCode = payrollService.getTaxCodeByEmployeeId(employee.id)

        // then join the results and call the calculate method
        return payrollService.calculateMonthlyTax(employee.employeeSalary, taxAllowance, taxCode)
    }

    //TODO learn co-routines
    @GetMapping("/fast-tax")
    fun getTaxByEmployeeIdFaster(@RequestParam(value = "name") name: String): Double {

        val employee: Employee = employeeService.getEmployeeByName(name)

        // these two methods calls could be run asynchronously
        val taxAllowance = payrollService.getTaxAllowanceByEmployeeId(employee.id)
        val taxCode = payrollService.getTaxCodeByEmployeeId(employee.id)

        // then join the results and call the calculate method
        return payrollService.calculateMonthlyTax(employee.employeeSalary, taxAllowance, taxCode)
    }
}