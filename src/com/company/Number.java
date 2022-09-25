package com.company;

public class Number {
    String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Number(String phoneNumber) {
        int len = phoneNumber.length();

        // Постановка "-" в нужнах местах

        phoneNumber = new StringBuffer(phoneNumber)
                .insert(len - 4, "-")
                .insert(len - 7,"-")
                .insert(len-10," ")
                .toString();

        // Добавить "+" в начало и уменьшить первый символ на 1
        if (phoneNumber.charAt(0) != '+') {
            phoneNumber =  phoneNumber.replace(phoneNumber.charAt(0), (char) (((int) phoneNumber.charAt(0)) - 1));
            phoneNumber = new StringBuffer(phoneNumber).insert(0, "+").toString();
        }
        this.phoneNumber = phoneNumber;
    }
}
