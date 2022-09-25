package com.company;

public class Client {
    public Chair chair;

    public void sit(){
        System.out.println("Садится на стул");
    }


    public void setChair(Chair chair) {
        this.chair = chair;
    }

}
