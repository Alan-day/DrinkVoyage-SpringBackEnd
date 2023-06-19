package com.nology.project;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Drink {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private int id;
    private String originCountry;
    private String name;
    private String category;

    private String description;

    private String flag;





    public Drink(String originCountry, String name, String category, String description, int id, String flag) {
        this.originCountry = originCountry;
        this.name = name;
        this.category = category;
        this.description = description;
        this.id = id;
        this.flag = flag;
    }

    public Drink() {
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDrinkId() {
        return id;
    }

    public void setDrinkId(int id) {
        this.id = id;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }






}