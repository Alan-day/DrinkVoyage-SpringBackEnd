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

    @Query(value= "SELECT * FROM drinks.drink WHERE category = 'wine'", nativeQuery = true)
    List<Drink> getWine();

    @Query(value= "SELECT * FROM drinks.drink WHERE category = 'beer'", nativeQuery = true)
    List<Drink> getBeer();
    @Query(value= "SELECT * FROM drinks.drink WHERE category = 'whiskey'", nativeQuery = true)
    List<Drink> getWhiskey();

    @Query(value= "SELECT * FROM drinks.drink WHERE category = 'vodka'", nativeQuery = true)
    List<Drink> getVodka();

    @Query(value= "SELECT * FROM drinks.drink WHERE category IN ('raki', 'rakija', 'rakia')", nativeQuery = true)
    List<Drink> getRakias();

    @Query(value= "SELECT * FROM drinks.drink WHERE category NOT IN ('wine', 'vodka', 'whiskey', 'beer', 'rakia', 'rakija', 'raki')", nativeQuery = true)
    List<Drink> getOther();







    void deleteDrinkById(int id);
    }

