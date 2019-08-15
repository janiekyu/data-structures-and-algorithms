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

    /*@Test public void testHead (){
        LinkedList<Integer> testList = new LinkedList<>();
        testList.insert(100);
        int headValue = testList.head.currentNodeValue;
        assertEquals(100, headValue);
    }*/

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

    @Test public void testkthFromEnd() throws Exception {
        assertEquals(2, multiNodeList.kthFromEnd(3));
    }

    @Test (expected = Exception.class)
    public void testkthFromEnd_kLongerThanList() throws Exception {
         multiNodeList.kthFromEnd(6);
    }

    @Test public void testkthFromEnd_kIsListLength() throws Exception {
        assertEquals(1,multiNodeList.kthFromEnd(4));
    }

    @Test (expected = Exception.class)
    public void testkthFromEnd_negativeK() throws Exception {
        multiNodeList.kthFromEnd(-6);
    }

    @Test (expected = Exception.class)
    public void testkthFromEnd_listOfOne() throws Exception {
        LinkedList<Integer> listOfOne = new LinkedList<>();
        listOfOne.insert(1);
        listOfOne.kthFromEnd(1);
    }

}

//https://www.webucator.com/how-to/how-throw-an-exception-java.cfm
//https://www.baeldung.com/junit-assert-exception