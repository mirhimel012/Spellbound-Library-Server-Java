package com.spellbound.controller;

import com.spellbound.model.Book;
import com.spellbound.repository.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:5173", "https://your-frontend.vercel.app"})
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/")
    public String home() {
        return "Spellbound Library server is running ✅";
    }

    @GetMapping("/book")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/book/{id}")
    public Book getBookById(@PathVariable String id) {
        return bookRepository.findById(id).orElse(null);
    }

    @PostMapping("/book")
    public Book addBook(@RequestBody Book newBook) {
        return bookRepository.save(newBook);
    }
}
