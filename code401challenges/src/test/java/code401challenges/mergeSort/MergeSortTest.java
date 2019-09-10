package code401challenges.mergeSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {
    @Test public void testMergeSort(){
        assertArrayEquals(new int[]{1,2,3,4,5}, MergeSort.mergeSort(new int []{3,1,5,4,2}));
        assertArrayEquals(new int[]{1,20,100}, MergeSort.mergeSort(new int []{20,100,1}));
    }

}