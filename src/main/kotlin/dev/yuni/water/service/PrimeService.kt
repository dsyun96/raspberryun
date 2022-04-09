package dev.yuni.water.service

import org.springframework.stereotype.Service

@Service
class PrimeService {
    fun isPrime(number: UInt): Boolean {
        if (number < 2u) {
            return false
        }

        for (i in 2u until number) {
            if (number % i == 0u) {
                return false
            }
            if (i * i > number) {
                break
            }
        }

        return true
    }
}