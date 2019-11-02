package com.codenerve.services

import org.springframework.stereotype.Service
import java.lang.Exception
import kotlin.random.Random

@Service
class PayrollService {

    fun getTaxAllowanceByEmployeeId(id: Long): Int {
        //TODO Make this a slow service
        return Random.nextInt(1000, 3000)
    }

    fun getTaxCodeByEmployeeId(id: Long): Int {
        return Random.nextInt(1, 3)
    }

    fun calculateMonthlyTax(salary: Int, taxAllowance: Int, taxCode: Int): Double {
        return when (taxCode) {
            1 -> ((salary - taxAllowance) / 100) * 10.0
            2 -> ((salary - taxAllowance) / 100) * 20.0
            3 -> ((salary - taxAllowance) / 100) * 40.0
            else -> {
                throw Exception("Could not calculate tax")
            }
        }
    }
}