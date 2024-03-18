package org.andreiio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void isEmpty() {
        // Check emptiness
        var queue = new Queue<Integer>();
        assertTrue(queue.isEmpty());
        queue.add(2);
        assertFalse(queue.isEmpty());
    }

    @Test
    void behavior() {
        var queue = new Queue<Integer>(1);
        assertEquals(queue.inspect(), 1);
        // More elements
        queue.add(2);
        // Proper element flow
        assertEquals(queue.inspect(), 1);

        assertEquals(queue.remove(), 1);
        assertEquals(queue.inspect(), 2);


    }

    @Test
    void inspect() {
        var queue = new Queue<Integer>();
        assertNull(queue.inspect());
        queue.add(1);
        assertEquals(queue.inspect(),1);
        queue.remove();
        queue.remove();
        assertNull(queue.inspect());
    }


}