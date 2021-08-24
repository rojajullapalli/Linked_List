package com.bridgelabz.list;

public class LinkedList {
    Node node;
    Node tail;
    Node head;

    public void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            this.node = newNode;
            this.tail = newNode;
            this.head = newNode;
        }else{
            Node temp=head;
            head=newNode;
            head.next=temp;
        }
    }

    public void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("previous node should not be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;

    }

    public void pop(){
        if (head == null){
            System.out.println("Should not be null");
            return;
        }
        System.out.println("\nNodes after deleting first element");
        head = head.next;
    }

    public void display(){
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(current != null) {

            System.out.print(current.data + " "  );
            current = current.next;
        }

    }

}
