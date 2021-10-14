package com.bridgelabz;


public class Stack extends LinkedList {
        Node top;
        int index;
        LinkedList list = new LinkedList();
        public void  push(int data){
            list.addFirst(data);
        }
        public void show(){
            list.show();
        }
        public static void main(String[] args) {
        Stack push = new Stack();
        push.push(56);
        push.push(30);
        push.push(70);
        push.show();
    }
}
