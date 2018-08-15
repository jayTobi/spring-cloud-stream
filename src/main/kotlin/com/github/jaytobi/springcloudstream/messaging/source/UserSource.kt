package com.github.jaytobi.springcloudstream.messaging.source

import com.github.jaytobi.springcloudstream.data.User
import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.messaging.Source
import org.springframework.messaging.support.MessageBuilder
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.time.LocalTime

/**
 * This class uses a simple Source (output) without any configuration like name, etc. see TODO
 */
@Component
@EnableBinding(Source::class)
class UserSource {
    @Autowired
    lateinit var source: Source  //this will autowire a Source mapped to the binding named "output" in the application.yml

    /**
     * This method sends a message every 5 seconds.
     */
    @Scheduled(fixedRate = 5000)
    fun sendMessage() {
        val user = createUser()
        log.debug { "sending user $user" }
        source.output().send(MessageBuilder.withPayload(user).build())
    }

    private fun createUser() = User("name ${LocalTime.now()}", "first name")
}

private val log = KotlinLogging.logger {}