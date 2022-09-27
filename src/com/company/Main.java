package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static <E> List<E> convert(E[] arr){
        return Arrays.asList(arr);
    }

    public static void main(String[] args) {
	    String[] arr = new String[]{
                "Peta",
                "Oly",
                "Ivan",
                "Dima"
        };
        Integer[] arr2 = new Integer[]{ 1,24,5,65,76,34,65};
        System.out.println(convert(arr));
        System.out.println(convert(arr2));
    }
}
