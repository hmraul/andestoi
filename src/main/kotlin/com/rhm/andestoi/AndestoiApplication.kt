package com.rhm.andestoi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = [
	"com.rhm.andestoi.infrastructure.configuration",
	"com.rhm.andestoi.infrastructure.controller"
])
class AndestoiApplication

fun main(args: Array<String>) {
	runApplication<AndestoiApplication>(*args)
}
