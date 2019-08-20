package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {
    @Test public void testEnqueue() throws Exception{
        PseudoQueue<Integer> testPseudoQ = new <Integer> PseudoQueue();
        testPseudoQ.enqueue(4);
        testPseudoQ.switchStack(testPseudoQ.enQStack);
        assertEquals(3, (int) testPseudoQ.enqueue(3));
    }

    @Test public void testSwitchStacks() throws Exception{
        PseudoQueue<Integer> testPseudoQ = new <Integer> PseudoQueue();
        testPseudoQ.enqueue(5);
        testPseudoQ.enqueue(4);
        testPseudoQ.enqueue(3);
        testPseudoQ.enqueue(2);
        testPseudoQ.enqueue(1);
        System.out.println("Stack with nodes" + testPseudoQ.whichStackHasNodes());
        testPseudoQ.switchStack(testPseudoQ.whichStackHasNodes());
        assertEquals(5, (int)testPseudoQ.dQStack.top.value);
        System.out.println("Stack with nodes" + testPseudoQ.whichStackHasNodes());
        testPseudoQ.switchStack(testPseudoQ.whichStackHasNodes());
        assertEquals(1, (int)testPseudoQ.enQStack.top.value);
    }

    @Test public void testDequeue() throws Exception{
        PseudoQueue<Integer> testPseudoQ = new <Integer> PseudoQueue();
        testPseudoQ.enqueue(3);
        testPseudoQ.enqueue(2);
        testPseudoQ.enqueue(1);
        assertEquals(3, (int) testPseudoQ.dequeue());
        assertEquals(2, (int) testPseudoQ.dequeue());
    }


    @Test (expected = Exception.class)
    public void testDequeueEmtpyList () throws Exception{
        PseudoQueue<Integer> testPseudoQ = new <Integer> PseudoQueue();
        testPseudoQ.dequeue();
    }

}