package code401challenges;

import java.util.Arrays;

public class ArrayShift {

    /*public static void main(String[] args) {
        insertShiftArray(new int[]{2,4,6,8}, 5);
        insertShiftArray(new int[]{4,8,15,23,42}, 16);
    }*/

    public static int[] insertShiftArray(int[] arrToBeShifted, int intToBeAdded){
        int newArrLength = arrToBeShifted.length + 1;
        int[] newArr = new int[newArrLength];
        int midpoint;

        if (arrToBeShifted.length%2 == 1){
            midpoint = arrToBeShifted.length/2+1;
        } else {
            midpoint = arrToBeShifted.length/2;
        }

        for (int i=0; i<newArrLength; i++){
            if (i < midpoint){
                newArr[i] = arrToBeShifted[i];
            } else if (i == midpoint){
                newArr[i] = intToBeAdded;
            } else {
                newArr[i] = arrToBeShifted[i-1];
            }
        }

        System.out.println(Arrays.toString(newArr));


        return  newArr;
    }
}
