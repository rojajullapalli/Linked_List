package com.bridgelabz.list;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("welcome to linkedlist program");
        LinkedList list = new LinkedList();
        list.append(70);
        list.append(56);
        list.insertAfter(list.head, 30);
        System.out.println("Nodes of singly linked list:");
        list.display();
        list.search(30);
        list.insertAfter(list.head.next,40);
        System.out.println("Nodes after addded 40 to list");
        list.display();
    }
}
