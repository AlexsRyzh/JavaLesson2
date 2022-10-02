package com.company.task3;

public class Multiply extends AbstractOperation{
    public Multiply(Math a, Math b) {
        super();
        elem1 = a;
        elem2 = b;
    }

    @Override
    public int getParameter() {
        return elem1.getParameter() * elem2.getParameter();
    }
}
