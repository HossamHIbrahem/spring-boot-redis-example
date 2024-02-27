package com.example.springbootredisexample

import com.example.springbootredisexample.model.Book
import com.example.springbootredisexample.service.BookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/book")
class BookController @Autowired constructor(
        private val bookService: BookService
) {

    @GetMapping("/{isbn}")
    fun getBookByIsbn(@PathVariable isbn: String): ResponseEntity<Book> {
        val book = bookService.getBookByIsbn(isbn)
        return if (book != null) ResponseEntity.ok(book) else ResponseEntity.notFound().build()
    }

    @DeleteMapping("/clear-cache")
    fun clearBookCache(): ResponseEntity<String> {
        bookService.clearBookCache()
        return ResponseEntity.ok("Cache for 'books' cleared successfully")
    }
}