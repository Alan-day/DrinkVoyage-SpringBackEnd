package com.nology.project;

public class Drink {


    private String originCountry;
    private String name;
    private String category;





    public Drink(String originCountry, String name, String category, String description, int drink_id) {
        this.originCountry = originCountry;
        this.name = name;
        this.category = category;
        this.description = description;
        this.drink_id = drink_id;
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

    public int getDrink_id() {
        return drink_id;
    }

    public void setDrink_id(int drink_id) {
        this.drink_id = drink_id;
    }

    private String description;

    private int drink_id;







}