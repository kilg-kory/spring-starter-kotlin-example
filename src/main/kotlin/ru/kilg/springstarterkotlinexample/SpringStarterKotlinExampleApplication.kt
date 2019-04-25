package ru.kilg.springstarterkotlinexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringStarterKotlinExampleApplication

fun main(args: Array<String>) {
    runApplication<SpringStarterKotlinExampleApplication>(*args)
}
