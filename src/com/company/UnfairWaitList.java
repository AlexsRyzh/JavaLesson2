package com.company;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {
    }

    /**
     * Функция удаления элемента из массива
     * если он не в начале списка
     * @param element
     */
    public void remove(E element){
        if (content.getFirst()!=element){
            content.remove(element);
        }
    }

    /**
     * Функция вставки элемента в конец массива
     * @param element
     */
    public void moveToBack(E element) {
        content.addLast(element);
    }

    @Override
    public String toString() {
        return "UnfairWaitList{" +
                "content=" + content +
                '}';
    }
}
