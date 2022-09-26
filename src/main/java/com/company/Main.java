package com.company;

import com.company.task2.Drink;
import com.company.task2.Order;
import com.company.task3.LoopLinkedList;

public class Main {

    public static void main(String[] args) {
        LoopLinkedList<Order> orders = new LoopLinkedList();
        for (int i=0; i<5; i++){
            Order order = new Order();
            order.addOrder(
                    new Drink("Ar"+i, "Op"+i+1)
            );
        }
        while (orders.getSize()>0){
            System.out.println(orders.get);
        }
    }
}
