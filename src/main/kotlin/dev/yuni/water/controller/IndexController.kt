package dev.yuni.water.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class IndexController {
    @GetMapping
    fun index(): String {
        return "Hello, world!"
    }

    @GetMapping("/ko")
    fun indexKorean(): String {
        return "와 샌즈 파피루스"
    }
}