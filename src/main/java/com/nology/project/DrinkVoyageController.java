package com.nology.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DrinkVoyageController {

    @Autowired
    DrinkVoyageService drinkVoyageService;









    @GetMapping("/greet")
    public String greet() {
        return "Hello World!";
    }

    @GetMapping("/list")
    public List <Drink> getDrinks() {
        return drinkVoyageService.getDrinks();
    }

    @GetMapping("/countries")
    public List <String> drinks() {
        return drinkVoyageService.getCountries();
    }



}
