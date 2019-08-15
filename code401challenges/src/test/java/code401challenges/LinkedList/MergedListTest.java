package code401challenges.LinkedList;

import org.junit.Test;
import static org.junit.Assert.*;

public class MergedListTest {
    LinkedList<Integer> listOne = new LinkedList<Integer>(){};
    LinkedList<Integer> listTwo  = new LinkedList<Integer>(){};
    LinkedList<Integer> mergedList  = new LinkedList<Integer>(){};


    @Test public void testMerge_differentLegthLists(){

        listOne.insert(5);
        listOne.insert(3);
        listOne.insert(1);

        listTwo.insert(9);
        listTwo.insert(8);
        listTwo.insert(7);
        listTwo.insert(6);
        listTwo.insert(4);
        listTwo.insert(2);

        mergedList = LinkedList.mergeLists(listOne, listTwo);
        assertEquals("Values in linked list, 1, 2, 3, 4, 5, 6, 7, 8, 9", mergedList.toString());

    }

    @Test public void testMerge_oneEmptyList(){

        listOne.insert(3);
        listOne.insert(2);
        listOne.insert(1);

        mergedList = LinkedList.mergeLists(listOne, listTwo);
        assertEquals("Values in linked list, 1, 2, 3", mergedList.toString());

        //System.out.println(mergedList);
    }

    @Test (expected = Exception.class)
    public void testMerge_twoEmptyList(){

        mergedList = LinkedList.mergeLists(listOne, listTwo);

        System.out.println(mergedList);
    }
}
