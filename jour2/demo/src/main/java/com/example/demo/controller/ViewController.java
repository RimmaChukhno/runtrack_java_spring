package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/list")
public String list(Model model) {
    var items = java.util.List.of("Alpha", "Beta", "Gamma");
    model.addAttribute("items", items);
    return "view";
}
}
