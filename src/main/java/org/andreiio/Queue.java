package org.andreiio;

import org.andreiio.linkedlist.LinkedList;

// FIFO data structure
public class Queue<T> {
    private LinkedList<T> list;

    public Queue() {

    }

    public Queue(T data) {
        this.list = new LinkedList<>(data);
    }

    public boolean isEmpty() {
        if (this.list == null)
            return true;
        return (this.list.getFirst() == null);
    }


    // Add another element to queue
    public void add(T data) {
        if (this.list == null)
            this.list = new LinkedList<>(data);
        else
            this.list.addFirst(data);
    }

    // Get top of queue without removing
    public T inspect() {
        if (this.list == null || this.list.getLast() == null)
            return null;
        return this.list.getLast().getData();
    }

    // Get top of queue and remove it
    public T remove() {
        if (this.list == null || this.list.getLast() == null)
            return null;
        var temp = this.list.getLast().getData();
        this.list.removeLast();
        return temp;
    }
}
