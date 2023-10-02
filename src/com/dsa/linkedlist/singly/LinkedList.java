package com.dsa.linkedlist.singly;

public class LinkedList {

    Node head= null;
    Node tail= null;


    public void add(int data){
        Node node= new Node(data);
        Node n= head;
        if(head== null){
            head= node;
        }
        while(n != null){
            if(n.next== null){
                n.next= node;
            }
            n= n.next;
        }
        System.out.println(head.next);
    }

    public void print(){
        Node n= head;
        while(n!= null){
            System.out.println(n.data);
            n= n.next;
        }
    }


    public static void main(String[] args) {

        LinkedList obj= new LinkedList();

        obj.add(10);
        obj.add(20);
        obj.add(30);

        obj.print();

    }
}
