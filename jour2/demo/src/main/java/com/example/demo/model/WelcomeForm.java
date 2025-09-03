package com.example.demo.model;

import jakarta.validation.constraints.NotBlank;

public class WelcomeForm {
    @NotBlank(message = "Name")
    private String name;

    // + getters/setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
