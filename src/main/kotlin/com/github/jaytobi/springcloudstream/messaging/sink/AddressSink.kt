package com.github.jaytobi.springcloudstream.messaging.sink

import com.github.jaytobi.springcloudstream.data.Address
import mu.KotlinLogging
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.cloud.stream.messaging.Sink
import org.springframework.messaging.MessageHeaders
import org.springframework.messaging.handler.annotation.Headers
import org.springframework.stereotype.Component

@Component
@EnableBinding(Sink::class)// TODO AddressSource.AddressChannel::class)
class AddressSink {
    @StreamListener("addressInput", condition = "headers.contentType matches 'application\\/vnd.address\\.v1\\+avro'")
    fun receive(address: Address, @Headers headers: MessageHeaders) {
        log.debug { "received message $address with headers: $headers" }
    }

}

private val log = KotlinLogging.logger {}