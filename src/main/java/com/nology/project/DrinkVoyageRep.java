package com.nology.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public interface DrinkVoyageRep extends JpaRepository<Drink, Integer>  {

    @Query(value= "SELECT * FROM drink", nativeQuery = true)
    List<Drink> getDrinks();

    @Query(value= "SELECT DISTINCT origin_country FROM drink", nativeQuery = true)
    List<String> getCountries();



    }

