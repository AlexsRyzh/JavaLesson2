package com.company;

public class AnyArray<E> {
    private E[] arr;

    public AnyArray(E[] arr) {
        this.arr = arr;
    }

    public E[] getArr() {
        return arr;
    }

    public E getElem(int index){
        if (index>arr.length && index<0) {
            throw new ArrayIndexOutOfBoundsException("invalid index");
        }
        return arr[index];
    }
}
