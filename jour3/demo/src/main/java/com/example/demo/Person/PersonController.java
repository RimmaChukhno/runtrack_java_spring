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
      repo.save(p);
      return "redirect:/people";
  }
  
  
  @PostMapping("/{id}/delete")
  public String delete(@PathVariable Long id) {
    repo.deleteById(id);
    return "redirect:/people";
  }

  @PostMapping("/{id}/update")
  public String update(@PathVariable Long id,
                       @RequestParam String name,
                       @RequestParam Integer age) {
    Person p = repo.findById(id).orElseThrow();
    p.setName(name);
    p.setAge(age);
    repo.save(p);
    return "redirect:/people";
  }
}