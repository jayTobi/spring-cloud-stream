package com.github.jaytobi.springcloudstream.messaging.sink

import com.github.jaytobi.springcloudstream.data.User
import mu.KotlinLogging
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.cloud.stream.messaging.Sink
import org.springframework.messaging.MessageHeaders
import org.springframework.messaging.handler.annotation.Headers
import org.springframework.stereotype.Component

@Component
@EnableBinding(Sink::class)
class UserSink {

    @StreamListener(Sink.INPUT, condition = "headers.contentType matches 'application\\/vnd.user\\.v2\\+avro'")  //this will use the binding "input" in the application.yml to receive the messages
    fun receive(user: User, @Headers headers: MessageHeaders) {
        log.debug { "received message $user with headers: $headers" }
    }
}

private val log = KotlinLogging.logger {}