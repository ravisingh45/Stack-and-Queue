package com.bridgelabz;

 public class LinkedList<T>  {
    Node<T> head;
    public void addFirst(T data){
        Node<T> node = new Node<T>();
        node.data=data;
        node.next = head;
        head = node;
    }

     public void pop() {
         if (head == null)
             System.out.println("\n" + "Stack is Empty!");
         else {
             Node<T> temp = head;
             System.out.printf("Deleted element: %d", head.data);
             System.out.println();
             head = temp.next;
         }
     }
     public T peak() {
         if(head != null)
             return head.data;
         else {
             System.out.println("Stack is Empty");
         }

         return null;
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
