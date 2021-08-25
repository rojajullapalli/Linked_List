package com.bridgelabz.list;

public class LinkedList {
    Node node;
    Node tail;
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            this.node = newNode;
            this.tail = newNode;
            this.head = newNode;
        } else {
            Node temp=head;
            this.head = newNode;
            this.head.next = temp;

        }
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
