package com.company;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedDeque;

public class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedDeque content;

    public WaitList(){
        content = new ConcurrentLinkedDeque<E>();
    }

    public WaitList(Collection<E> c){
        content = new ConcurrentLinkedDeque<E>();
        content.addAll(c);
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }


    /**
     *  Функция для добавления элемента
     * @param element
     */
    @Override
    public void add(E element) {
        content.add(element);
    }

    /**
     *  Функция для удаления элемента
     */
    @Override
    public E remove() {
        return (E)content.remove();
    }

    /**
     * Функция проверки вхождения элемента в массив
     * @param element
     */
    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    /**
     *  Функция проверки вхождения всех элментов массива (c)
     *  в массив content
     * @param c
     */
    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }



    /**
     * Функция проверки массива на пустоту
     * @param
     */
    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }
}
