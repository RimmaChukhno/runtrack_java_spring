package com.example.demo.controller;

import com.example.demo.model.WelcomeForm;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ViewController {

    // GET form
    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("welcomeForm", new WelcomeForm());
        return "view"; // open view.html
    }

    // POST
    @PostMapping("/form")
    public String submit(
            @Valid WelcomeForm welcomeForm,
            BindingResult binding,
            Model model) {
        if (binding.hasErrors()) {
            model.addAttribute("message", "Corriger les erreurs de formulaire");
            return "view";
        }
        model.addAttribute("message", "Bienvenue, " + welcomeForm.getName() + " !");
        return "view";
    }
}
