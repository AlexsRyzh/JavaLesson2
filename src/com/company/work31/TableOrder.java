package com.company.work31;

import java.util.Arrays;
import java.util.Comparator;

public class TableOrder implements Order{
    private int size;
    private MenuItem[] items = new MenuItem[0];


    @Override
    public boolean add(MenuItem item) {
        if (item == null) return false;
        if (size==items.length){
            items = Arrays.copyOf(items,size*2);
        }
        items[size++]=item;
        return true;
    }

    @Override
    public String[] itemsNames() {
        String[] itemsNames1 = new String[size];
        for (int i=0; i<size; i++){
            itemsNames1[i] = items[i].getName();
        }
        return itemsNames1;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int numberOf = 0;
        for (int i=0; i<size; i++){
            if (items[i].getName() == itemName) numberOf++;
        }
        return numberOf;
    }

    @Override
    public int itemsQuantity(MenuItem itemName) {
        return itemsQuantity(itemName.getName());
    }

    @Override
    public MenuItem[] getItems() {
        return items;
    }

    @Override
    public boolean remove(String itemName) {
        boolean correct = false;
        for (int i=0; i<size; i++){
            if (items[i].getName() == itemName){
                for (int j = i; j<size-1; j++){
                    items[j] = items[j+1];
                }
                correct = true;
                break;
            }
        }
        size--;
        return correct;
    }

    @Override
    public boolean remove(MenuItem item) {
        return remove(item.getName());
    }

    @Override
    public int removeAll(String itemName) {
        int numberOf = 0;
        for (int i=0; i<size; i++){
            if (items[i].getName() == itemName){
                for (int j = i; j<size-1; j++){
                    items[j] = items[j+1];
                }
                numberOf ++;
            }
        }
        return numberOf;
    }

    @Override
    public int removeAll(MenuItem item) {
        return removeAll(item.getName());
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
            Arrays.sort(items, new Comparator<MenuItem>() {
                @Override
                public int compare(MenuItem o1, MenuItem o2) {
                    return o2.getCost() - o1.getCost();
                }
            });
            return items;
    }

    @Override
    public int costTotal() {
        int cost = 0;
        for (MenuItem item: items){
            cost+=item.getCost();
        }
        return cost;
    }

    @Override
    public Customer getCustomer() {
        return null;
    }

    @Override
    public void setCustomer(Customer customer) {

    }


}
