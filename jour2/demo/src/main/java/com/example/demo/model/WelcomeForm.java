package com.example.demo.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class WelcomeForm {

    @NotBlank(message = "Le nom est obligatoire")
    private String name;

    @NotNull(message = "L'âge est obligatoire")
    @Min(value = 1, message = "L'âge doit être au minimum 1")
    @Max(value = 120, message = "L'âge doit être au maximum 120")
    private Integer age;

    // getters et setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}


// package com.example.demo.model;

// import jakarta.validation.constraints.NotBlank;

// public class WelcomeForm {
//     @NotBlank(message = "Name")
//     private String name;

//     // + getters/setters
//     public String getName() { return name; }
//     public void setName(String name) { this.name = name; }
// }
