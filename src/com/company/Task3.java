package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String string = "00323.5400.4353 USD  nonfvd43.23 RUB 44 ERR  sdjfidv435.3RUB 00004.5464  EU";
        String regEx = "([1-9][0-9]*)([.][0-9]+)?\\s+((RUB)|(EU)|(USD))\\s";
        System.out.println(string);
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(string);
        while(matcher.find()){
            System.out.println(matcher.group().replaceAll("\\s{2,}"," "));
        }
    }
}
