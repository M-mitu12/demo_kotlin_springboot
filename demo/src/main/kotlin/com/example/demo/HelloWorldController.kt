package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("greet")
class HelloWorldController {
    @GetMapping("new")
    fun hello(): String{
        return "Hello Mayuri"
    }
    @GetMapping
    fun print(): String{
        return "Starting"
    }
}