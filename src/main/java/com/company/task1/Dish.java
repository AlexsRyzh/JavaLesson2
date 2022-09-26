package com.company.task1;

import com.company.task2.Item;

public class Dish implements Item {
    private int price = 0;
    private String title;
    private String description;

    public Dish(){}

    public Dish(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Dish(int price, String title, String description) {
        this.price = price;
        this.title = title;
        this.description = description;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
