package com.bridgelabz.list;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("welcome to linkedlist program");
        LinkedList list = new LinkedList();
        list.append(70);
        list.append(30);
        list.append(56);
        System.out.println("Nodes of singly linked list:");
        list.display();
    }
}
