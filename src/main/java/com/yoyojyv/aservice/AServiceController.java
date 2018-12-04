package com.yoyojyv.aservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AServiceController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }

}
