package com.example.springbootredisexample.service

import com.example.springbootredisexample.model.Book
import com.example.springbootredisexample.repository.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cache.annotation.CacheEvict
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

@Service
class BookService @Autowired constructor(
        private val bookRepository: BookRepository
) {

    @Cacheable("books")
    fun getBookByIsbn(isbn: String): Book? {
        return bookRepository.findById(isbn).orElse(null)
    }

    @CacheEvict(value = ["books"], allEntries = true)
    fun clearBookCache() {
        // Clear the entire cache for "books"
    }

}