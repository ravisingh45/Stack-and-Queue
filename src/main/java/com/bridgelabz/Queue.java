package com.bridgelabz;

public class Queue<T> {
    LinkedList<T> list = new LinkedList<>();
    public void enqueue(T data) {
        list.addFirst(data);
    }
    public void show() {
        list.show();
    }
    public static void main(String[] args) {
       Queue<Integer> list = new Queue<Integer>();
       list.enqueue(56);
       list.enqueue(30);
       list.enqueue(70);
       list.show();
    }
}
