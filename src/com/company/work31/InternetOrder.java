package com.company.work31;


import java.util.Arrays;
import java.util.Comparator;

public class InternetOrder implements Order{
    class ListNode{
        private ListNode next;
        private MenuItem value;

        public ListNode(MenuItem value) {
            this.value = value;
        }

        public ListNode(ListNode next, MenuItem value) {
            this.next = next;
            this.value = value;
        }

    }

    private int size;
    private ListNode head;
    private ListNode tail;

    @Override
    public boolean add(MenuItem item) {
        if (item == null) return false;
        ListNode a = new ListNode(item);  //создаём новый элемент
        if (tail == null)           //если список пуст
        {                           //то указываем ссылки начала и конца на новый элемент
            head = a;               //т.е. список теперь состоит из одного элемента
            tail = a;
        } else {
            tail.next = a;          //иначе "старый" последний элемент теперь ссылается на новый
            tail = a;               //а в указатель на последний элемент записываем адрес нового элемента
        }
        size++;
        return true;
    }

    @Override
    public String[] itemsNames() {
        String[] names = new String[size];
        int i=0;
        ListNode elem = head;
        while (elem != null){
            names[i++] = elem.value.getName();
            elem = elem.next;
        }
        return names;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int numberOf = 0;
        ListNode start = head;
        while (head!=null){
            if (head.value.getName() == itemName){
                numberOf++;
            }
        }
        return numberOf;
    }

    @Override
    public int itemsQuantity(MenuItem itemName) {
        return itemsQuantity(itemName.getName());
    }

    @Override
    public MenuItem[] getItems() {
        MenuItem[] items = new MenuItem[size];
        int i=0;
        ListNode elem = head;
        while (elem != null){
            items[i++] = elem.value;
            elem = elem.next;
        }
        return items;
    }

    @Override
    public boolean remove(String itemName) {

        if(head == null)        //если список пуст -
            return false;

        if (head == tail && head.value.getName() == itemName) {     //если список состоит из одного элемента
            head = null;        //очищаем указатели начала и конца
            tail = null;
            return true;             //и выходим
        }

        if (head.value.getName() == itemName) {    //если первый элемент - тот, что нам нужен
            head = head.next;       //переключаем указатель начала на второй элемент
            return true;                 //и выходим
        }

        ListNode t = head;       //иначе начинаем искать
        while (t.next != null) {    //пока следующий элемент существует
            if (t.next.value.getName() == itemName) {  //проверяем следующий элемент
                if(tail == t.next)      //если он последний
                {
                    tail = t;           //то переключаем указатель на последний элемент на текущий
                }
                t.next = t.next.next;   //найденный элемент выкидываем
                return true;                 //и выходим
            }
            t = t.next;                //иначе ищем дальше
        }
        size--;
        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        return remove(item.getName());
    }

    @Override
    public int removeAll(String itemName) {
        if(head == null)        //если список пуст -
            return 0;
        int numberOf = 0;
        if (head == tail && head.value.getName() == itemName) {
            head = null;
            tail = null;
            return 1;
        }

        while (head.value.getName() == itemName) {
            head = head.next;
            numberOf++;
        }

        ListNode t = head;
        while (t.next != null) {
            if (t.next.value.getName() == itemName) {
                if(tail == t.next)
                {
                    tail = t;
                }
                t.next = t.next.next;
                numberOf++;
            }
            t = t.next;
        }
        size-=numberOf;
        return numberOf;
    }

    @Override
    public int removeAll(MenuItem item) {
        return removeAll(item.getName());
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        ListNode elem = head;
        MenuItem[] arr = new MenuItem[size];
        int i=0;
        while (elem!=null){
            arr[i] = elem.value;
            i++;
            elem=elem.next;
        }
        Arrays.sort(arr, new Comparator<MenuItem>() {
            @Override
            public int compare(MenuItem o1, MenuItem o2) {
                return o2.getCost() - o1.getCost();
            }
        });
        i=0;
        elem = head;
        while (elem!=null){
            elem.value = arr[i];
            elem = elem.next;
        }
        return arr;
    }

    @Override
    public int costTotal() {
        int costTot = 0;
        ListNode elem = head;
        while(elem!=null){
            costTot+=elem.value.getCost();
            elem = elem.next;
        }
        return costTot;
    }

    @Override
    public Customer getCustomer() {
        return null;
    }

    @Override
    public void setCustomer(Customer customer) {

    }
}
