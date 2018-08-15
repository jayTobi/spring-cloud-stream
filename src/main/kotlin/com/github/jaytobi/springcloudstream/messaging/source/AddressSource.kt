package com.github.jaytobi.springcloudstream.messaging.source

import com.github.jaytobi.springcloudstream.data.Address
import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.annotation.Input
import org.springframework.cloud.stream.annotation.Output
import org.springframework.cloud.stream.messaging.Sink
import org.springframework.cloud.stream.messaging.Source
import org.springframework.stereotype.Component
import org.springframework.messaging.MessageChannel
import org.springframework.messaging.SubscribableChannel
import org.springframework.messaging.support.MessageBuilder
import org.springframework.scheduling.annotation.Scheduled
import kotlin.math.roundToInt


@Component
@EnableBinding(AddressSource.AddressChannel::class)
class AddressSource {
    @Autowired
    lateinit var addressChannel: AddressChannel

    @Scheduled(fixedRate = 7000)
    fun sendAddressMessage() {
        val address = createAddress()
        log.debug { "sending address $address" }
        addressChannel.output().send(MessageBuilder.withPayload(address).build())
    }


    private fun createAddress() = Address("street ${(Math.random() * 100).roundToInt()}", "city ", "country ")


    interface AddressChannel {

        @Output("addressOutput")
        fun output(): MessageChannel

        @Input("addressInput")
        fun input(): SubscribableChannel
    }
}

private val log = KotlinLogging.logger {}
