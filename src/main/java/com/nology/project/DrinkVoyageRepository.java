package com.nology.project;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DrinkVoyageRepository {

    private final List<Drink> drinks = new ArrayList<>();

    {drinks.add(new Drink("1","2","3","5",1));};


    public void addDrink(Drink drink) {
        drinks.add(drink);
    }



    public List<Drink> getDrinks() {
        return  drinks;
    }


}