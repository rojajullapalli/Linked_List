package com.bridgelabz.list;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("welcome to linkedlist program");
        LinkedList list = new LinkedList();
        list.add(70);
        list.add(30);
        list.add(56);
        System.out.println("Nodes of singly linked list:");
        list.display();
    }
}
