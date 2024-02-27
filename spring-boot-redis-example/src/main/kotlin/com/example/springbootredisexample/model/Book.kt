package com.example.springbootredisexample.model

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash
import java.io.Serializable

@RedisHash("Book")
data class Book(
        @Id
         val isbn: String,
         val title: String,
         val author: String
) : Serializable
