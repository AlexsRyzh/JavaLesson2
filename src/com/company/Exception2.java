package com.company;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try{
            int i = Integer.parseInt(intString); System.out.println( 2 / i );
        }catch (NumberFormatException e){
            System.out.println(e);
        }
/*        catch (Exception e){ <= Задание 3
            System.out.println(e);
        }*/
        /*finally {   <= Задание 4
            System.out.println("Finelly");
        }*/


    }
}


