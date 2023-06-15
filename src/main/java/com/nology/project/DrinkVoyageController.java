package com.nology.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000")

public class DrinkVoyageController {

    @Autowired
    DrinkVoyageService drinkVoyageService;



    @PostMapping("/createDrink")
    public ResponseEntity <Drink> createDrink(@RequestBody Drink drink) {
        Drink newDrink = drinkVoyageService.addDrink(drink);
        return ResponseEntity.status(HttpStatus.CREATED).body(newDrink);
    }






    @GetMapping("/list")
    public ResponseEntity< List <Drink>> getDrinks() {
        return ResponseEntity.status(HttpStatus.OK).body(drinkVoyageService.getDrinks());
    }

    @GetMapping("/countries")
    public List <String> drinks() {
        return drinkVoyageService.getCountries();
    }



    @DeleteMapping("/list/{id}")
    public ResponseEntity<Void> deleteDrinkById(@PathVariable int id) {
        drinkVoyageService.deleteDrinkById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }




}
