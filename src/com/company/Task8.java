package com.company;

import java.util.Scanner;

public class Task8 {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        link:
        while (true){
            try{
                System.out.print("Enter Key ");
                String key = myScanner.nextLine();
                printDetails( key );
                break link;
            }catch (Exception e){
                System.out.println(e);
            }
        }


    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message ); }
    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
}
