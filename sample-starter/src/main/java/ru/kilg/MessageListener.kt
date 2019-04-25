package ru.kilg

import org.springframework.context.ApplicationListener
import org.springframework.context.event.ContextRefreshedEvent

class MessageListener : ApplicationListener<ContextRefreshedEvent>{
    override fun onApplicationEvent(event: ContextRefreshedEvent) {
        println("Very famous message in system out")
    }

}