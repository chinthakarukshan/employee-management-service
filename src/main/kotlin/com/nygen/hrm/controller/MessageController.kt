package com.nygen.hrm.controller

import com.nygen.hrm.domain.Message
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController {

    @GetMapping("/")
    fun getIndex(@RequestParam("name") name: String)= listOf(Message("1","First Object"),Message("2","Second Object"),Message("3","Third Object"),)
}