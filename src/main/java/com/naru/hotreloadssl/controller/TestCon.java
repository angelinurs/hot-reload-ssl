package com.naru.hotreloadssl.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCon {
	
    @GetMapping(path = "/", produces = MediaType.TEXT_PLAIN_VALUE)
    String helloWorld() {
        return "Hello World";
    }
    
}
