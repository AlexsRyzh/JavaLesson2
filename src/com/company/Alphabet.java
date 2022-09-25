package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Alphabet {

    FileReader reader;


    public void test() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        this.reader = new FileReader(filename);
        System.out.println(getLine());
    }

    private String getLine() {
        Scanner scanner = new Scanner(reader);


        // Разбиение текста на отдельные слова
        StringTokenizer stringTokenizer = new StringTokenizer(scanner.nextLine(), " :,.", false);

        // Массив со словами из текста
        ArrayList<String> arrayList = new ArrayList<String>();
        while(stringTokenizer.hasMoreTokens()){
            arrayList.add(stringTokenizer.nextToken());
        }

        int maxSteps = arrayList.size();
        int steps = 0;
        StringBuffer string = new StringBuffer();
        String last = "";

        // Добавление первого элемента в итоговую строку
        if (arrayList.size() > 0) {
            string.append(arrayList.get(0));
            last = arrayList.get(0);
            arrayList.remove(0);
        }

        //  Добавление последующих элементов в строку
        while (steps != maxSteps && arrayList.size() != 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (last.toLowerCase().charAt(last.length() - 1) == arrayList.get(i).toLowerCase().charAt(0)) {
                    string.append(" ").append(arrayList.get(i));
                    last = arrayList.get(i);
                    arrayList.remove(i);
                    break;
                }
            }
            steps += 1;
        }

        return string.toString();
    }
}
