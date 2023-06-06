package com.nhuamani.bookstoreapi;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @ResponseStatus(value = HttpStatus.CREATED)
    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String index(@RequestParam(defaultValue = "Watson") String name) {
        return "Hello " + name + "!!!";
    }
}
