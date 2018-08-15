package com.github.jaytobi.springcloudstream

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
class SpringCloudStreamApplication

fun main(args: Array<String>) {
    runApplication<SpringCloudStreamApplication>(*args)
}
