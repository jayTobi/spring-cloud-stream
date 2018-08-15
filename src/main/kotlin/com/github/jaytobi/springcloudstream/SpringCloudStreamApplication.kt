package com.github.jaytobi.springcloudstream

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.stream.schema.client.EnableSchemaRegistryClient
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling  //used for sending messages periodically
@EnableSchemaRegistryClient //used for looking up avro schemas or saving them
class SpringCloudStreamApplication

fun main(args: Array<String>) {
    runApplication<SpringCloudStreamApplication>(*args)
}
