package com.github.jaytobi.springcloudstream.messaging.sink

import com.github.jaytobi.springcloudstream.data.User
import mu.KotlinLogging
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.cloud.stream.messaging.Sink
import org.springframework.stereotype.Component

@Component
@EnableBinding(Sink::class)
class UserSink {

    @StreamListener(Sink.INPUT)
    fun receive(user : User){
        log.debug { "received message $user" }
    }
}

private val log = KotlinLogging.logger {}