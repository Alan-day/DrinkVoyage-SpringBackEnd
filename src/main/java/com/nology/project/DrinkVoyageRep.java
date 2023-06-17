package com.nology.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public interface DrinkVoyageRep extends JpaRepository<Drink, Integer>  {

    @Query(value= "SELECT * FROM drinks.drink", nativeQuery = true)
    List<Drink> getDrinks();

    @Query(value= "SELECT DISTINCT origin_country FROM drinks", nativeQuery = true)
    List<String> getCountries();



    List<Drink> getAllDrinksByCategory(String category);

    void deleteDrinkById(int id);
    }

