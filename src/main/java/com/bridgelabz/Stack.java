package com.bridgelabz;


public class Stack<T> {
        Node<T> top;
        int index;
        LinkedList<T> list = new LinkedList<T>();
        public void  push(T data){
            list.addFirst(data);
        }
        public void pop() {
                list.pop();
        }
        public T peek() {

                while(list.peak() != null) {
                        System.out.println("Top most element of the stack is: "+list.peak());
                        break;
                }
                return list.peak();
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
                System.out.println();
        push.peek();
        push.pop();
        push.pop();
        push.pop();
        push.show();
    }
}
