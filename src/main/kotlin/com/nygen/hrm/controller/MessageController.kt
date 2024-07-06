package com.nygen.hrm.controller

import com.nygen.hrm.domain.Message
import com.nygen.hrm.service.MessageService
import org.springframework.web.bind.annotation.*

@RestController
class MessageController(val service:MessageService) {

    @GetMapping("/")
    fun index(): List<Message> = service.findMessages()

    @PostMapping("/")
    fun post(@RequestBody message: Message) {
        service.save(message)
    }
}