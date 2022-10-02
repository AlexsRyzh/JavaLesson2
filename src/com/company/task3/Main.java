package com.company.task3;

import com.company.task3.*;

public class Main {

    public static void main(String[] args) {
	    int n = new Add(
                new Substract(
                        new Multiply(
                                new Variable("x"),
                                new Variable("x")
                        ),
                        new Multiply(
                                new Const(2),
                                new Variable("x")
                        )
            ),
                new Const(1)
        ).evaluate();
        System.out.println(n);
    }
}
