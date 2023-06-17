package com.nology.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
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


    @GetMapping("/list/{id}")
    public ResponseEntity<Drink> getDrinkById(@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.OK).body(drinkVoyageService.getDrinkById(id));
    }


    @GetMapping("/list")
    public ResponseEntity< List <Drink>> getDrinks() {
        return ResponseEntity.status(HttpStatus.OK).body(drinkVoyageService.getDrinks());
    }

    @GetMapping("/list/categories")
    public ResponseEntity <List<Option>> getDrinksByCategory() {
        return ResponseEntity.status(HttpStatus.OK).body(drinkVoyageService.getDrinksByCategory());
    }

    @PutMapping("/list/edit/{id}")
    public ResponseEntity<Drink> updateDrink(@RequestBody Drink newDrink, @PathVariable int id) {
        Drink updatedDrink = drinkVoyageService.updateDrink(newDrink, id);
        return ResponseEntity.status(HttpStatus.OK).body(updatedDrink);
    }

    @DeleteMapping("/list/edit/{id}")
    public ResponseEntity<Void> deleteDrinkById(@PathVariable int id) {
        drinkVoyageService.deleteDrinkById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }




}
