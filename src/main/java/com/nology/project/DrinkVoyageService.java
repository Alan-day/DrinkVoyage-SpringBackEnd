package com.nology.project;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.stream.Collectors;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class DrinkVoyageService {


    @Autowired
    DrinkVoyageRep drinkVoyageRep;

// creating a drink card
    public Drink addDrink(Drink drink) {

        Drink newDrink = drinkVoyageRep.save(drink);

        System.out.println(newDrink);
        return newDrink;

    }

    // read
    public Drink getDrinkById(int id) {
        return drinkVoyageRep.findById(id).orElseThrow(() -> new IllegalArgumentException("Drink not found with ID: " + id));
    }


// getting the cards
    public List <Drink> getDrinks() {
        return  drinkVoyageRep.getDrinks();
    } // why does it work with the same name of the method in the repository?

// getting different drinks
    public List <Drink> getWines() {
        return  drinkVoyageRep.getWine();
    }

    public List<Drink> getBeers() {
        return drinkVoyageRep.getBeer();
    }

    public List<Drink> getVodkas() {
        return drinkVoyageRep.getVodka();
    }

    public List<Drink> getRakias() {
        return drinkVoyageRep.getRakias();
    }

    public List<Drink> getOthers() {
        return drinkVoyageRep.getOther();
    }
    public List<Drink> getWhiskeys() {
        return drinkVoyageRep.getWhiskey();
    }




    // deleting a card

    @Transactional
    public void deleteDrinkById(int id) {
        if (!drinkVoyageRep.existsById(id)) {
            System.out.println(("Drink not found"));
        }

        drinkVoyageRep.deleteDrinkById(id);
    }





    @Modifying
    public Drink updateDrink(Drink newDrink, int id) {

        if (!drinkVoyageRep.existsById(id)) {
            System.out.print("Greeting Not Found");
        }

        Drink updatedDrink = drinkVoyageRep.save(newDrink);


        return updatedDrink;
    }







}
