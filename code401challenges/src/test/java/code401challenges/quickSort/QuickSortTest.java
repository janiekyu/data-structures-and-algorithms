package code401challenges.quickSort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test public void testQuickSort(){
        assertArrayEquals(
                new int[]{2,3, 4, 8, 9, 15, 17, 20},
                QuickSort.quickSort((new int[]{2,15,8,3,20,4,17,9}), 0, 7)
        );

        assertArrayEquals(
                new int[]{0,50,100},
                QuickSort.quickSort((new int[]{100,0,50}), 0, 2)
        );

        assertArrayEquals(
                new int[]{0,0,2,5},
                QuickSort.quickSort((new int[]{2,0,5,0}), 0, 3)
        );

        assertArrayEquals(
                new int[]{1},
                QuickSort.quickSort((new int[]{1}), 0, 0)
        );

        assertArrayEquals(
                new int[]{7,7},
                QuickSort.quickSort((new int[]{7,7}), 0, 1)
        );

    }

}