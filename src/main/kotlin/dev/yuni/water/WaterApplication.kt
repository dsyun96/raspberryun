package dev.yuni.water

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WaterApplication

fun main(args: Array<String>) {
    runApplication<WaterApplication>(*args)
}
