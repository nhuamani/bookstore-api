package com.nhuamani.bookstoreapi.controllers;

import com.nhuamani.bookstoreapi.models.Book;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

//    @RequestMapping(method = RequestMethod.GET, path = "/")
    @GetMapping("/")
    public String index(@RequestParam(defaultValue = "Watson") String name) {
        return "Hello " + name + "!!!";
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping("/books")
    Book createBook(@RequestBody Book book) {
        return book;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable Integer id) {
        Book book = new Book();
        book.setId(id);
        book.setTitle("Python");
        book.setPrice(56f);

        return book;
    }
}
