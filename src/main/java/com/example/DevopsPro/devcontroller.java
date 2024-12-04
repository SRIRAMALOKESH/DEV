package com.example.DevopsPro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class devcontroller {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello this is my cloud devops project!";
    }
}