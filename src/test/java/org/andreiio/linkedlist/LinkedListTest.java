package org.andreiio.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void addFirst() {
        LinkedList<Integer> list = new LinkedList<>(1);
        list.addFirst(2);
        assertEquals(list.getFirst().getData(), 2);
    }

    @Test
    void getFirst() {
        LinkedList<Integer> list = new LinkedList<>(1);
        assertEquals(list.getFirst().getData(), 1);
    }

    @Test
    void removeFirst() {
        // remove only one element
        LinkedList<Integer> list = new LinkedList<>(1);
        list.removeFirst();
        assertNull(list.getFirst());
        // empty list
        list.removeFirst();
        assertNull(list.getFirst());
        // multiple elements before remove
        list.addFirst(1);
        list.addFirst(2);
        assertEquals(list.getFirst().getData(), 2);

    }

    @Test
    void addLast() {
        LinkedList<Integer> list = new LinkedList<>(1);
        list.addLast(2);
        list.addFirst(3);
        list.addLast(4);
        assertEquals(list.getLast().getData(), 4);
    }

    @Test
    void getLast() {
        LinkedList<Integer> list = new LinkedList<>(1);
        list.addLast(2);
        assertEquals(list.getLast().getData(), 2);
    }

    @Test
    void removeLast() {
        // multiple elements
        LinkedList<Integer> list = new LinkedList<>(1);
        list.addLast(2);
        list.removeLast();
        assertEquals(list.getLast().getData(), 1);
        // empty list
        list.removeLast();
        assertNull(list.getLast());
    }
}