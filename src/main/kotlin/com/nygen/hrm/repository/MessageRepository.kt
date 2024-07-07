package com.nygen.hrm.repository

import com.nygen.hrm.domain.Message
import org.springframework.data.repository.CrudRepository

interface MessageRepository:CrudRepository<Message,String>