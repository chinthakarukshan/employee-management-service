package com.nygen.hrm.service

import com.nygen.hrm.domain.Message
import com.nygen.hrm.repository.MessageRepository
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service
import java.util.UUID
import kotlin.jvm.optionals.toList

@Service
class MessageService(val db:MessageRepository) {
    /*fun findMessages(): List<Message> = db.query("select * from messages") { response, _ ->
        Message(response.getString("id"), response.getString("text"))
    }*/

    fun findMessages(): List<Message> = db.findAll().toList()

    /*fun save(message: Message) {
        val id = message.id?:UUID.randomUUID().toString()
        db.update(
            "insert into messages values ( ?, ? )",
            id, message.text
        )
    }*/

    fun save(message: Message) {
        db.save(message)
    }

    /*fun findMessageById(id: String): List<Message> = db.query("select * from messages where id = '$id'") { response, _ ->
        Message(response.getString("id"), response.getString("text"))
    }*/

    fun findMessageById(id: String): List<Message> = db.findById(id).toList()

}