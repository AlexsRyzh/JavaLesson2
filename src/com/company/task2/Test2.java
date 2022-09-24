package com.company.task2;

public class Test2 {
    public static void main(String[] args) {
        Address address1 = new Address("a. b: c- d- e: f: g");
        System.out.println(address1);

        Address address2 = new Address("a, b, c, d, e, f, g");
        System.out.println(address2);

        Address address3 = new Address("a. b,,,,,,,,,,,,,, c,,,,,,,, d, e,,,,,,,,,,,,,,, f, g");
        System.out.println(address3);

        Address address4 = new Address("a b c d e f g");
        System.out.println(address4);
    }
}
