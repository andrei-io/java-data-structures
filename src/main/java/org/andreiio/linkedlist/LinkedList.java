package org.andreiio.linkedlist;

public class LinkedList<T> {
    private Node<T> head;

    public LinkedList() {
    }

    public LinkedList(T value) {
        this.head = new Node<T>(value);
    }

    public void addFirst(T value) {
        if (this.head == null) {
            this.head = new Node<T>(value);
            return;
        }

        var newHead = new Node<T>(value);
        newHead.setNext(this.head);
        this.head = newHead;
    }

    public Node<T> getFirst() {
        return this.head;
    }

    public void removeFirst() {
        if (this.head == null)
            return;

        this.head = this.head.getNext();
    }

    public void addLast(T value) {
        if (this.head == null) {
            this.head = new Node<T>(value);
            return;
        }

        var current = this.head;

        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(new Node<T>(value));
    }

    public Node<T> getLast() {
        var current = this.head;

        while (current != null && current.getNext() != null) {
            current = current.getNext();
        }

        return current;
    }

    public void removeLast() {
        // Special case of only one element
        if(this.head != null && this.head.getNext() == null) {
            this.head = null;
            return;
        }
        var current = this.head;

        while (current != null && current.getNext() != null && current.getNext().getNext() != null) {
            current = current.getNext();
        }

        current.setNext(null);
    }


    public void printList() {
        var current = this.head;

        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }

    }


}
