package com.company;

public class BoundedWaitList<E> extends WaitList<E>{
    private int capacty;

    public BoundedWaitList(int capacty) {
        this.capacty = capacty;
    }

    /**
     * Возвращает максимальный размер списка
     */
    public int getCapacty() {
        return capacty;
    }

    /**
     *  Функция добавления элементов в массив
     * @param element
     */

    @Override
    public void add(E element) {
        if (content.size()<capacty)
            super.add(element);
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacty=" + capacty +
                '}';
    }
}
