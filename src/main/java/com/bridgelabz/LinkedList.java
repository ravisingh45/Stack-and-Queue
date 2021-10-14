package com.bridgelabz;

 public class LinkedList extends Node {
    Node head;
    public void addFirst(int data){
        LinkedList list = new LinkedList();
        list.data=data;
        list.next = head;
        head = list;
    }
    public void show(){
        Node node = head;
        while (node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}
