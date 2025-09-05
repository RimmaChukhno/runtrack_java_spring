package com.example.demo.Person;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/people")
public class PersonController {
  private final PersonRepository repo;

  public PersonController(PersonRepository repo) { this.repo = repo; }

  @GetMapping
  public String list(Model model) {
    model.addAttribute("people", repo.findAll());
    model.addAttribute("personForm", new Person());
    return "people";
  }

  @PostMapping
  public String create(@ModelAttribute("personForm") Person p) {
    repo.save(p);             // создание
    return "redirect:/people";
  }
}