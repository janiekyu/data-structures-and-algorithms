package stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test public void testCreateStack(){
        Stack newStack = new Stack();
        assertNull(newStack.peek());
    }

    @Test public void testPush(){
        Stack <Integer> newStack = new <Integer> Stack();
        newStack.push(7);
        assertEquals(7, (int) newStack.peek());
    }

    @Test public void testPopPopulatedStack(){
        Stack newStack = new Stack();
        newStack.push(3);
        newStack.push(2);
        newStack.push(1);
        newStack.pop();
        assertEquals(2, newStack.peek());
    }

    @Test public void testPopUntilEmtpy(){
        Stack newStack = new Stack();
        newStack.push(3);
        newStack.push(2);
        newStack.pop();
        newStack.pop();
        assertNull(newStack.top);
    }

    @Test (expected = Exception.class)
    public void testPopEmptyStack(){
        Stack newStack = new Stack();
        newStack.pop();
    }


}