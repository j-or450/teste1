package com.mentorama.teste1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alomundo")
public class AlaMundoController {
    private final String message = "Ola mundo";

    @GetMapping
    public String olaMundo(){
        return message;
    }
}