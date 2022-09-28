package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Введите email: ");
        String string = in.nextLine();
        if (string.matches("^([a-zA-Z0-9_\\-.]+)@([a-zA-Z0-9_\\-]+)(\\.([a-zA-Z]{2,5}))?$")){
            System.out.println("Да");
        }else{
            System.out.println("Нет");
        }
    }
}
