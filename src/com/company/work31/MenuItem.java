package com.company.work31;

import java.util.Random;

public class MenuItem {
    private final int cost;
    private final String name;
    private final String description;

    public MenuItem() {
        Random rand = new Random();
        cost = rand.nextInt();
        name = "Фантазёр";
        description = "Вкусно";
    }

    public MenuItem(String name, String description) {
        cost = 0;
        this.name = name;
        this.description = description;
    }

    public MenuItem(int cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
