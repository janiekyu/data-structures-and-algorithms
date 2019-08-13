package code401challenges.LinkedList;

import org.junit.Before;
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

    LinkedList<Integer> multiNodeList = new LinkedList<>();

    @Before public void buildTestList() {
        multiNodeList.insert(5);
        multiNodeList.insert(4);
        multiNodeList.insert(3);
        multiNodeList.insert(2);
        multiNodeList.insert(1);
    }

    @Test public void testInsertMultipleNodes(){

        multiNodeList.includes(3);
        System.out.println(multiNodeList);

        //assertEquals("Values in linked list, 10, 5, 3", multiNodeList.toString());
    }

    @Test public void testAppend(){
        multiNodeList.append(10);
        assertEquals("Values in linked list, 1, 2, 3, 4, 5, 10", multiNodeList.toString());
    }

    @Test public void testInsertBefore(){
        multiNodeList.insertBefore(5,10);
        assertEquals("Values in linked list, 1, 2, 3, 4, 10, 5", multiNodeList.toString());
    }

    @Test public void testInsertAFter(){
        multiNodeList.insertAfter(3, 100);
        assertEquals("Values in linked list, 1, 2, 3, 100, 4, 5", multiNodeList.toString());
    }

}