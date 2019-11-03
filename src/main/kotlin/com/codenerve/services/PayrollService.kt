package com.codenerve.services

import kotlinx.coroutines.delay
import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class PayrollService {

    private val delay: Long = 2_000

    fun getTaxAllowanceByEmployeeId(id: Long): Int {
        //TODO Make this a slow service
        Thread.sleep(delay)
        return Random.nextInt(1000, 3000)
    }

    fun getTaxCodeByEmployeeId(id: Long): Int {
        Thread.sleep(delay)
        return Random.nextInt(1, 3)
    }


    suspend fun getTaxAllowanceByEmployeeIdFast(id: Long): Int {
        delay(delay)
        return Random.nextInt(1000, 3000)
    }

    suspend fun getTaxCodeByEmployeeIdFast(id: Long): Int {
        delay(delay)
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