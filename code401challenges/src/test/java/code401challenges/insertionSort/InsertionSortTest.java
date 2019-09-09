package code401challenges.insertionSort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test public void testInsertionSort(){
        int[] testArray = {5,2,3,4,1};
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, InsertionSort.insertionSort(testArray));
    }

    @Test public void testInsertionSortAllZeros(){
        int[] testArray = {0,0,0};
        assertArrayEquals(new int[]{0,0,0}, InsertionSort.insertionSort(testArray));
    }

    @Test public void testInsertionSortEmptyArray(){
        int[] testArray = {};
        assertArrayEquals(new int[]{}, InsertionSort.insertionSort(testArray));
    }

}