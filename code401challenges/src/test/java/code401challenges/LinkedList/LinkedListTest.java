package code401challenges.LinkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test public void testInitializingALinkedList (){
        LinkedList<Integer> emptyList = new LinkedList<>();
        assertEquals(null, emptyList.head);
        //System.out.println(emptyList.head);
    }

    @Test public void testLinkedList1(){

        LinkedList<Integer> test1List = new LinkedList<>();
        test1List.insert(3);
        test1List.insert(5);
        test1List.insert(10);
        test1List.includes(3);
        System.out.println(test1List);
    }
}