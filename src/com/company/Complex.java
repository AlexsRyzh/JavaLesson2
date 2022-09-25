package com.company;

public class Complex {
    private int real = 0;
    private int image = 0;

    public Complex(){}

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString(){
        return real + " + "+image+"i";
    }
}
