package com.example.parcial2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/mensaje")
    public String mensaje() {
        return "La compilación y arranque funcionan correctamente!";
    }
}

