package com.ifspbra.springboot.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String helloMessage(){
        return "Ola mundo, criando o primeiro Springboot";
    }
}
