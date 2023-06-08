package com.nology.project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkVoyageService {


    @Autowired
    DrinkVoyageRep drinkVoyageRep;


    public Drink addDrink(Drink drink) {

        Drink newDrink = drinkVoyageRep.save(drink);

        System.out.println(newDrink);
        return newDrink;

    }


    public List <Drink> getDrinks() {
        return  drinkVoyageRep.getDrinks();
    }

    public List <String> getCountries() {
        return  drinkVoyageRep.getCountries();
    }


}
