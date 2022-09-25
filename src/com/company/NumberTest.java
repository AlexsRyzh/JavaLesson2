package com.company;

public class NumberTest {
    public static void main(String[] args) {
        Number phoneNumber1 = new Number("+79175655655");
        System.out.println(phoneNumber1.getPhoneNumber());

        Number phoneNumber2 = new Number("+1042896952211");
        System.out.println(phoneNumber2.getPhoneNumber());

        Number phoneNumber3 = new Number("99175655655");
        System.out.println(phoneNumber3.getPhoneNumber());
    }
}
