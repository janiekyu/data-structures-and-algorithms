package code401challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest  {
    @Test public void testInsertShiftArray_1 () {
        assertArrayEquals(
                "Incorrect",
                new int[]{2,4,5,6,8},
                ArrayShift.insertShiftArray(new int[]{2,4,6,8}, 5));
    }

    @Test public void testInsertShiftArray_2 () {
        assertArrayEquals(
                "Incorrect",
                new int[]{4,8,15,16,23,42},
                ArrayShift.insertShiftArray(new int[]{4,8,15,23,42}, 16));
    }
}

