package com.example.helloworldlja.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
class HelloController {

    @GetMapping("/hi")
    public String helloWorld() {
        return "Prueba de servicio en la nube";
    }
}