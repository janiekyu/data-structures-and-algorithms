package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    @Test public void testCreateQueue(){
        Queue newQueue = new Queue();
        assertNull(newQueue.peek());
    }

    @Test public void testEnqueToEmptyQueue(){
        Queue <Integer> newQueue = new <Integer> Queue();
        newQueue.enqueue(1);
        assertEquals(1, (int)newQueue.peek());
    }

    @Test public void testEnqueMultiple(){
        Queue <Integer> newQueue = new <Integer> Queue();
        newQueue.enqueue(1);
        newQueue.enqueue(2);
        newQueue.enqueue(3);
        assertEquals(3, (int)newQueue.end.value);
    }

    @Test public void testDenqueMultiple(){
        Queue <Integer> newQueue = new <Integer> Queue();
        newQueue.enqueue(1);
        newQueue.enqueue(2);
        newQueue.enqueue(3);
        newQueue.enqueue(4);
        newQueue.enqueue(5);

        newQueue.dequeue();
        newQueue.dequeue();

        assertEquals(3, (int)newQueue.peek());

    }

    @Test public void testEmptyQueue(){
        Queue <Integer> newQueue = new <Integer> Queue();
        newQueue.enqueue(1);
        newQueue.enqueue(2);

        newQueue.dequeue();
        newQueue.dequeue();

        assertNull(newQueue.peek());

    }

}