package com.company.task2;

public class Drink implements Item{
    private int price = 0;
    private String title;
    private String description;

    public Drink(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Drink(int price, String title, String description) {
        this.price = price;
        this.title = title;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
