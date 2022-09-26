package com.company.task3;

public class LoopLinkedList<E> {
    private node<E> start = null;
    private node<E> end = null;
    private int size = 0;
    class node<E> {
        public node next;
        public node prev;
        public E order;
    }

    public LoopLinkedList() {}

    public int getSize() {
        return size;
    }

    public void addElement(E item){
        if (start == null){
            start = new node<E>();
            start.order = item;
            end = start;
            start.next = end;
            start.prev = end;
            end.prev = start;
            end.next = start;
            size++;
            return;
        }
        node node1 = new node<E>();
        node1.order = item;
        start.prev = node1;
        end.next = node1;
        node1.prev = end;
        node1.next = start;
        end = node1;
        size++;
    }

    public E pop(){
        if (size == 1){
            E popElem = start.order;
            start = null;
            end = null;
            size--;
            return popElem;
        }
        if (size > 1){
            E popElem = end.order;
            end.prev.next = start;
            start.prev = end;
            end = end.prev;
            size--;
            return popElem;
        }
        return null;
    }
}
