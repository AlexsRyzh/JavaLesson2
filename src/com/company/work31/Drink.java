package com.company.work31;

public class Drink extends MenuItem implements Alcoholable{
    private final double alcoholVol;
    private final DrinkTypeEnum type;

    public Drink() {
        alcoholVol = 60;
        type = DrinkTypeEnum.BEER;
    }

    public Drink(String name, String description, double alcoholVol, DrinkTypeEnum type) {
        super(name, description);
        this.alcoholVol = alcoholVol;
        this.type = type;
    }

    public Drink(int cost, String name, String description, double alcoholVol, DrinkTypeEnum type) {
        super(cost, name, description);
        this.alcoholVol = alcoholVol;
        this.type = type;
    }

    public DrinkTypeEnum getType() {
        return type;
    }

    @Override
    public boolean isAlcoholicDrinck() {
        return type.isAlco();
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }
}
