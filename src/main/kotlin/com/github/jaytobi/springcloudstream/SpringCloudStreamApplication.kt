package com.github.jaytobi.springcloudstream

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling  //used for sending messages periodically
class SpringCloudStreamApplication

fun main(args: Array<String>) {
    runApplication<SpringCloudStreamApplication>(*args)
}
