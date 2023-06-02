package com.nology.project;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DrinkVoyageRepository {

    private final List<Drink> drinks = new ArrayList<>();


    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

}