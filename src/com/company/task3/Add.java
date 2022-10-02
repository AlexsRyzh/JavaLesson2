package com.company.task3;

public class Add extends AbstractOperation{
    public Add(Math a, Math b) {
        super();
        elem1 = a;
        elem2 = b;
    }

    @Override
    public int getParameter() {
        return elem1.getParameter() + elem2.getParameter();
    }
}
