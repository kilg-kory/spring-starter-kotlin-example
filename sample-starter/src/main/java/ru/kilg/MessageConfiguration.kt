package ru.kilg

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class MessageConfiguration {

    @Bean
    fun messageListener(): MessageListener {
        return MessageListener()
    }

}