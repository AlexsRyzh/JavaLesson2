package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String string = "6 5+2+9";
        String regEx = "[0-9]\\s*([^+]|$)";
        System.out.println(string);
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()){
            System.out.println("Есть");
        }else{
            System.out.println("Нет");
        }
    }
}
