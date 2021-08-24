package com.bridgelabz.list;

import java.util.ArrayList;
import java.util.Collections;

public class LinkedList<T extends Comparable <T>> {
    ArrayList<Integer> li = new ArrayList<Integer>();
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
            Node temp = head;
            head = newNode;
            head.next = temp;
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

    public void remove(int key) {
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null)
            return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }
    public void size(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("\nsize of the linkedlist is "+count);

    }
    public void addToArrayList(){
        Node temp=head;
        int i=0;
        while(temp!=null){
            li.add(i,temp.data);
            i++;
            temp=temp.next;
        }
        getsort(li);

    }
    public void getsort(ArrayList<Integer> list){
        Collections.sort(list);
        System.out.println("the elements stored in arraylist"+list);
    }
}
