package com.company.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NotValidINN {
        String name;
        String surname;
        String lastName;
        String INN;
        Scanner in= new Scanner(System.in);
        System.out.print("Введите имя: ");
        name = in.nextLine();
        System.out.print("Введите фамилию: ");
        surname = in.nextLine();
        System.out.print("Введите отчество: ");
        lastName = in.nextLine();
        System.out.print("Введите ИНН: ");
        INN = in.nextLine();
        if (INN.matches("[0-9]{12}")) System.out.println("Всё верно");
        else throw new NotValidINN();

    }
}
