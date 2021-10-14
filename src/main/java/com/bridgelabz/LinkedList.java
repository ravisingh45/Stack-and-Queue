package com.bridgelabz;

 public class LinkedList<T>  {
    Node<T> head;
    public void addFirst(T data){
        Node<T> node = new Node<T>();
        node.data=data;
        node.next = head;
        head = node;
    }

     public void show(){
        Node<T> node = head;
        if (head == null){
            System.out.println("stack is empty");
        }
        while (node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}
