package com.nhuamani.bookstoreapi;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String index(@RequestParam(defaultValue = "Watson") String name) {
        return "Hello " + name + "!!!";
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @RequestMapping(method = RequestMethod.POST, path = "/books")
    Book createBook(@RequestBody Book book) {
        return book;
    }
}
