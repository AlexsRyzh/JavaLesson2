package com.company.task3;

public class Substract extends AbstractOperation {

    public Substract(Math a, Math b) {
        super();
        elem1 = a;
        elem2 = b;
    }


    @Override
    public int getParameter() {
        return elem1.getParameter() - elem2.getParameter();
    }
}
