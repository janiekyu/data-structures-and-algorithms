package code401challenges;

public class BinarySearch {

    /*Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. Without utilizing any of the built-in methods available to your language, return the index of the array’s element that is equal to the search key, or -1 if the element does not exist.*/



    public static int binarySearch (int[] sortedArray, int key){

        int startIndex = 0;
        int endIndex = sortedArray.length-1;
        boolean foundInWhileLoop = false;
        int middleIndex = 0;
        int result = 0;

        arrayDivider: while (startIndex != endIndex){
            middleIndex = (endIndex-startIndex)/2 + startIndex;
            System.out.println("start: " + startIndex + " | middle: " + middleIndex + " | end: " + endIndex);
            if (key == sortedArray[middleIndex]) {
                foundInWhileLoop = true;
                break arrayDivider;
            } else if (key > sortedArray[middleIndex]) {
                // If the key is larger than the 'middle' value...
                // Move the startIndex to look at the right half of array
                startIndex = middleIndex + 1;
            } else {
                // If the key is less than the 'middle' value
                // Move the endIndex to look at the left half of array
                endIndex = middleIndex - 1;
            }
        }

        if (foundInWhileLoop) {
            result = middleIndex;
        } else if (key == sortedArray[startIndex]){
            result = startIndex;
        } else {
            result = -1;
        }
        System.out.println(result);
        return result;
    }
}
