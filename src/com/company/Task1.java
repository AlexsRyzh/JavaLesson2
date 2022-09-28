package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = "Оля,Петя.Нина,Николай: Дима; adsfvsf, fsdfdfv";
        System.out.println(string);
        System.out.println("Введите regex: ");
        String regex = in.nextLine();
        List<String> list = Arrays.asList(string.split(regex));
        System.out.println(list.size());
        for (String item: list){
            System.out.println(item);
        }
    }
}
