package com.csc340.f24_rest_api_demo;

public class Fruit {
    public String name;
    public String family;
    public double calories;

    public Fruit(String name, String family, double calories) {
        this.name = name;
        this.family = family;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
}
