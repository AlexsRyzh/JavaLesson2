package com.company.task3;

import java.util.ArrayList;

public abstract class AbstractOperation implements Math {
    protected Math elem1;
    protected Math elem2;
    private static ArrayList<Variable> unknownVariables= new ArrayList();



    public static void addUnknownVariables(AbstractElem elem){
        unknownVariables.add((Variable) elem);
    }

    @Override
    public int evaluate(int... param) {
        for (int i=0; i<unknownVariables.size(); i++){
            unknownVariables.get(i).setParam(param[0]);
        }
        return getParameter();
    }
}
