package com.example.starter.template.check;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {

    @GetMapping("/health")
    public String healthCheck() {
        return "hello world!";
    }
}
