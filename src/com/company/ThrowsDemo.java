package com.company;

public class ThrowsDemo {
    public void getDetails(String key) {
        try{
            if(key == null) {
                throw new NullPointerException( "null key in getDetails" );
            }
        }catch (Exception e){
            System.out.println(e);
        }

        // do something with the key
    }
}

