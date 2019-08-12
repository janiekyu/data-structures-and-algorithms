package code401challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test public void testBinarySearch_oddArray () {
        int[] oddArray = new int[]{1,2,3,4,5,6,7};
        assertEquals(
                "Incorrect index of an odd array returned",
                0,
                BinarySearch.binarySearch(oddArray, 1)
        );
    }

    @Test public void testBinarySearch_evenArray () {
        int[] evenArray = new int[]{1,2,3,4,5,6};
        assertEquals(
                "Incorrect index of an even returned",
                0,
                BinarySearch.binarySearch(evenArray, 1)
        );
    }

    @Test public void testBinarySearch_shortArray () {
        int[] shortArray = new int[]{1,2};
        assertEquals(
                "Incorrect index of a short returned",
                0,
                BinarySearch.binarySearch(shortArray, 1)
        );
    }

    @Test public void testBinarySearch_keyDoesNotExist () {
        int[] someArray = new int[]{1,2,3,4,5,6,7};
        assertEquals(
                "Expected a return value of -1 if the key does not exist in the array",
                -1,
                BinarySearch.binarySearch(someArray, 9)
        );
    }

    @Test public void testBinarySearch_repeatd () {
        int[] arrayRepeatedValues = new int[]{4,4,4,4};
        assertEquals(
                "Still should return the midpoint index",
                1,
                BinarySearch.binarySearch(arrayRepeatedValues, 4)
        );
    }

}