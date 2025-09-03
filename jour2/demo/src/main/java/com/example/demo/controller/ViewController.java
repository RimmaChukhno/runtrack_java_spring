package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/view")
    public String view(Model model) {
        model.addAttribute("message", "Bonjour depuis Thymeleaf!");
        return "view"; // cherches templates/view.html
    }
}
