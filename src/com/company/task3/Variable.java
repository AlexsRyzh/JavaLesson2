package com.company.task3;

import java.util.ArrayList;

public class Variable extends AbstractElem {

    private String name;
    public Variable(String var) {
        super();
        name = var;
        AbstractOperation.addUnknownVariables(this);
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setParam(int param){
        parameter = param;
    }
}
