package com.company;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String regex = "abcdefghijklmnopqrstuv18340";
        System.out.println("Введите строку: ");
        String string = in.nextLine();
        System.out.println(string.matches(regex));
    }
}
