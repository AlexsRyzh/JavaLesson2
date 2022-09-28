package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Task5 {

    public static boolean checkDate(int day, int month, int years){
        int[] days = new int[]{31,0,31,30,31,30,31,31,30,31,30,31};
        if (day > 29 && years%4==0 && month == 2){
            return false;
        }
        if (day > 28 && years%4!=0 && month == 2){
            return false;
        }
        if (days[month-1]<day && month != 2) return false;
        return true;
    }

    public static void main(String[] args) {
        String string = "01/01/2003";
        String regEx = "^(([1-2][0-9])|(3[0-1])|(0[1-9]))/(([1][0-2])|(0[1-9]))/((19[0-9]{2})|([2]\\d{3}))$";
        System.out.println(string);
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(string);
        if (matcher.matches()){
            ArrayList<Integer> list = new ArrayList<>();
            for (String item: matcher.group().split("/")){
                list.add(Integer.parseInt(item));
            }
            if (checkDate(list.get(0), list.get(1), list.get(2))){
                System.out.println("Является");
            }else{
                System.out.println("Не является");
            }

        }else{
            System.out.println("Не является");
        }
    }
}
