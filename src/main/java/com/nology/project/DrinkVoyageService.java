package com.nology.project;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
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
    }
// getting available countries
    public List <String> getCountries() {
        return  drinkVoyageRep.getCountries();
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


    public List<Drink> getDrinksByCategory(String category, int limit) {
        String formattedCategory = category.replace("-", " ");

        List<Drink> categories = drinkVoyageRep.getAllDrinksByCategory(formattedCategory);

        return categories
                .stream()
                .limit(limit)
                .collect(Collectors.toList());
    }





}
