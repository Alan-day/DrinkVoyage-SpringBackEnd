package com.nology.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DrinkVoyageController {

    @Autowired
    DrinkVoyageService drinkVoyageService;






    @PostMapping("/home")
    public Drink createDrink(@RequestBody Drink drink) {
        drinkVoyageService.addDrink(drink);
        return drink;
    }

}
