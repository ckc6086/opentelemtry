package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AzureContainerRegistryLogin {

    @GetMapping("/")
    public String home() {
        System.out.println("호출!!");
        return "form";
    }
}
