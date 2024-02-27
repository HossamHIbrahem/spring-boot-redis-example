package com.example.springbootredisexample.repository

import com.example.springbootredisexample.model.Book
import org.springframework.data.repository.CrudRepository

interface BookRepository: CrudRepository<Book, String> {
}