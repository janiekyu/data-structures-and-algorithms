package code401challenges.LinkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test public void testInitializingALinkedList (){
        LinkedList<Integer> emptyList = new LinkedList<>();
        assertEquals(null, emptyList.head);
        //System.out.println(emptyList.head);
    }

    @Test public void testHead (){
        LinkedList<Integer> testList = new LinkedList<>();
        testList.insert(100);
        int headValue = testList.head.currentNodeValue;
        assertEquals(100, headValue);
    }

    @Test public void testInsertMultipleNodes(){

        LinkedList<Integer> multiNodeList = new LinkedList<>();
        multiNodeList.insert(3);
        multiNodeList.insert(5);
        multiNodeList.insert(10);
        multiNodeList.includes(3);
        System.out.println(multiNodeList);

        assertEquals("Values in linked list, 10, 5, 3", multiNodeList.toString());
    }
}