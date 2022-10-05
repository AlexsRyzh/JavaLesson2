package com.company.work31;

public class Address {
    private final String cityName;
    private final String zipCode;
    private final String streetName;
    private final int buildingNumber;
    private final char buildingLetter;
    private final int apartmentNumber;

    public Address(String cityName,
                   String zipCode,
                   String streetName,
                   int buildingNumber,
                   char buildingLetter,
                   int apartmentNumber) {
        this.cityName = cityName;
        this.zipCode = zipCode;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.buildingLetter = buildingLetter;
        this.apartmentNumber = apartmentNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public char getBuildingLetter() {
        return buildingLetter;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }
}
