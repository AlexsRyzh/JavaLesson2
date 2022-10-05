package com.company.work31;

public enum DrinkTypeEnum {
    BEER(true),
    WINE(true),
    VODKA(true),
    BRANDY(true),
    CHAMPAGNE(true),
    WHISKEY(true),
    TEQUILA(true),
    RUM(true),
    VERMUTH(true),
    LIQUOR(true),
    JAGERMEISTER(true),
    JUICE(false),
    COFFEE(false),
    GREEN_TEA(false),
    BLACK_TEA(false),
    MILK(false),
    WATER(false),
    SODA(false);

    private boolean isAlco;

    DrinkTypeEnum(boolean isAlco) {
        this.isAlco = isAlco;
    }

    public boolean isAlco() {
        return isAlco;
    }
}
