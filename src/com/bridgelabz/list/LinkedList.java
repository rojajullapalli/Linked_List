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
            tail.next = newNode;
            tail = newNode;
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

    public void popLast() {
        if (head == null)
            System.out.println("List is Empty");
        Node last = head;
        Node temp = null;
        while (last.next != null){
            temp = last;
            last = last.next;
        }
        temp.next = null;
        last.next = temp.next;
    }

    public void search(int key){
        Node current = head;
        int count = 1;
        int found = 0;
        while(current != null){
            if (current.data == key){
                found=1;
                break;
            }
            count = count + 1;
            current = current.next;

        }
        if (found ==1 )
            System.out.println("\nNode with value "+key+" is found at position " +count);
        else
            System.out.println("Element is not present in the list");
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
