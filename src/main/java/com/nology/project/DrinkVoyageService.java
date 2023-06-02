package com.nology.project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkVoyageService {


    @Autowired
    DrinkVoyageRepository drinkVoyageRepository;


    public void addDrink(Drink drink) {
        drinkVoyageRepository.addDrink(drink);
    }

    public List<Drink> getDrinks() {
        return  drinkVoyageRepository.getDrinks();
    }

}
