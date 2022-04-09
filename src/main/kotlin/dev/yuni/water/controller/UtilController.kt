package dev.yuni.water.controller

import dev.yuni.water.service.PrimeService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/util")
class UtilController(
    private val primeService: PrimeService
) {
    @GetMapping("/prime/{number}")
    fun primeCheck(
        @PathVariable(name = "number", required = true) numberOrAny: String,
        model: Model
    ): String {
        val number = numberOrAny.toUIntOrNull() ?: throw IllegalArgumentException("음이 아닌 정수(32비트)를 입력해주세요.")
        val isPrime: Boolean = primeService.isPrime(number)

        model.addAttribute("number", number)
        model.addAttribute("no", if (isPrime) "" else " not")

        return "prime"
    }
}