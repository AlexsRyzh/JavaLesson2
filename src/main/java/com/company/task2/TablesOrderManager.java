package com.company.task2;

public class TablesOrderManager {
    private Order[] tableOrders;
    private int capacity = 0;
    private int size = 0;

    public TablesOrderManager(int size) {
        if (size*2 < 1024){
            this.capacity = size*2;
        }else{
            this.capacity = (int) (size*1.5);
        }
        this.size = size;

        tableOrders = new Order[capacity];
    }

    public void addOrder(Order newOrder){
        if (size == capacity){
            if (capacity*2 <1024) {
                copy(capacity*=2);
            }else{
                copy(capacity*=1.5);
            }
        }
        tableOrders[size] = newOrder;
        size+=1;
    }

    public Order getOrder(int index) throws Exception {
        if (index<0 && index>=size){
            throw new Exception("Не верный индекс");
        }
        return tableOrders[index];
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    private void copy(int newCapacity){
        Order[] newOrders = new Order[newCapacity];
        for (int i=0; i<size; i++){
            newOrders[i] = tableOrders[i];
        }
        tableOrders = newOrders;
    }
}
