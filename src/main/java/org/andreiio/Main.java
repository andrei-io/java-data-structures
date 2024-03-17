package org.andreiio;

import org.andreiio.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(1);
        list.addLast(2);
        list.removeLast();
        list.removeLast();
        list.printList();
    }
}