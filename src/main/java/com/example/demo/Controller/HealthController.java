package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HealthController {
    
    @GetMapping("/health")
    public String checkAPI(){
        return "<h1>The API is working ok!</h1>";
    }
    

}
