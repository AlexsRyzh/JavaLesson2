package com.company.task3;

public abstract class AbstractElem implements Math{
    protected int parameter;

    public AbstractElem() {
    }

    public AbstractElem(int parameter) {
        this.parameter = parameter;
    }

    @Override
    public int getParameter() {
        return parameter;
    }

    public void setParameter(int parameter) {
        this.parameter = parameter;
    }

    @Override
    public int evaluate(int... param) {
        return getParameter();
    }
}
