package com.nology.project;


import org.springframework.beans.factory.annotation.Autowired;
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


}
