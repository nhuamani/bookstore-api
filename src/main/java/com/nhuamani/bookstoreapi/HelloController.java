package com.nhuamani.bookstoreapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String index() {
        return "Hello " +  "!!!";
    }
}
