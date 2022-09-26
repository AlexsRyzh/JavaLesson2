package com.company.task2;


public class Order {
    private Item[] items;
    private int capacity;
    private int size = 0;

    public Order(int size) {
        if (size*2 < 1024){
            this.capacity = size*2;
        }else{
            this.capacity = (int) (size*1.5);
        }
        this.size = size;

        items = new Item[capacity];
    }

    public Order() {
        this.capacity = 2;
    }

    public Item getItem(){
        return null;
    }


    public void addOrder(Item item){
        if (size == capacity){
            if (capacity*2 <1024) {
                copy(capacity*=2);
            }else{
                copy(capacity*=1.5);
            }
        }
        items[size] = item;
        size+=1;
    }

    public int size(){
        return size;
    }
    public int getCapacity(){
        return capacity;
    }

    private void copy(int newCapacity){
        Item[] newItems = new Item[newCapacity];
        for (int i=0; i<size; i++){
            newItems[i] = items[i];
        }
        items = newItems;
    }
}
