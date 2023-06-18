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











    @GetMapping("/list/wines")
    public ResponseEntity<List<Drink>> getWines() {

        return ResponseEntity.status(HttpStatus.OK).body(drinkVoyageService.getWines());
    }


    @GetMapping("/list/whiskeys")
    public ResponseEntity<List<Drink>> getWhiskeys() {

        return ResponseEntity.status(HttpStatus.OK).body(drinkVoyageService.getWhiskeys());
    }

    @GetMapping("/list/beers")
    public ResponseEntity<List<Drink>> getBeers() {

        return ResponseEntity.status(HttpStatus.OK).body(drinkVoyageService.getBeers());
    }
    @GetMapping("/list/rakias")
    public ResponseEntity<List<Drink>> getRakias() {

        return ResponseEntity.status(HttpStatus.OK).body(drinkVoyageService.getRakias());
    }

    @GetMapping("/list/vodkas")
    public ResponseEntity<List<Drink>> getVodkas() {

        return ResponseEntity.status(HttpStatus.OK).body(drinkVoyageService.getVodkas());
    }



    @GetMapping("/list/others")
    public ResponseEntity<List<Drink>> getOthers() {

        return ResponseEntity.status(HttpStatus.OK).body(drinkVoyageService.getOthers());
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
