package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Введите пароль: ");
        String string = in.nextLine();
        Matcher matcher1 = Pattern.compile("[0-9]").matcher(string);
        Matcher matcher2 = Pattern.compile("[a-z]").matcher(string);
        Matcher matcher3 = Pattern.compile("[A-Z]").matcher(string);
        if (string.length()>=8
                && matcher1.find()
                && matcher2.find()
                && matcher3.find()){
            System.out.println("Да");
        }else{
            System.out.println("Нет");
        }
    }
}
