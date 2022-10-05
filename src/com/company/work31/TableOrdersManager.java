package com.company.work31;

import java.util.ArrayList;

public class TableOrdersManager implements OrdersManager{
    private Order[] orders = (Order[]) new ArrayList<Order>(10).toArray();

    public void add(Order order, int tableNumber){
        assert tableNumber-1<orders.length && tableNumber>0;
        orders[tableNumber-1] = order;
    }

    public void addItem(MenuItem item, int tableNumber){
        TableOrder tableOrder = new TableOrder();
        tableOrder.add(item);
        add(tableOrder,tableNumber);
    }

    public int freeTableNumber(){
        for (int i=0; i<orders.length; i++){
            if (orders[i]==null) return i+1;
        }
        return 0;
    }

    public int[] freeTableNumbers(){
        int colvo = 0;
        for (int i=0; i<orders.length; i++){
            if (orders[i]==null) colvo++;
        }
        int[] arrays = new int[colvo];
        colvo=0;
        for (int i=0; i<orders.length; i++){
            if (orders[i]==null) arrays[colvo++]=i+1;
        }
        return arrays;
    }

    public Order getOrder(int tableNumber){
        assert tableNumber-1<orders.length && tableNumber>0;
        return orders[tableNumber];
    }

    public void remove(int tableNumber){
        assert tableNumber-1<orders.length && tableNumber>0;
        orders[tableNumber] = null;
    }

    public int remove(Order order){
        for (int i=0; i<orders.length; i++){
            if (orders[i] == order){
                orders[i] = null;
                return i+1;
            }
        }
        return 0;
    }

    public int removeAll(Order order){
        int numberOf = 0;
        for (int i=0; i<orders.length; i++){
            if (orders[i] == order){
                orders[i] = null;
                numberOf++;
            }
        }
        return numberOf;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int numberOf = 0;
        for (int i=0; i<orders.length; i++){
            MenuItem[] items = orders[i].getItems();
            for (MenuItem elem: items){
                if (elem.getName() == itemName){
                    numberOf++;
                }
            }
        }
        return numberOf;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        return 0;
    }

    @Override
    public Order[] getOrders() {
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        return 0;
    }

    @Override
    public int ordersQuantity() {
        return 0;
    }
}
