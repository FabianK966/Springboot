package com.example.learning.springboot_demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/en/Hello")
    public String helloen() {
        return "Hello";
    }
    @GetMapping("/de/Hello")
    public String hellode() {
        return "Hallo";
    }
    @GetMapping("/sp/Hello")
    public String hellosp() {
        return "Hola";
    }
    @GetMapping("/fr/Hello")
    public String hellofr() {
        return "Bonjour";
    }
    @GetMapping("/ar/Hello")
    public String helloar() {
        return "مرحبًا";
    }

}
