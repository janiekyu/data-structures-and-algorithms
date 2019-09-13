package code401challenges.quickSort;

public class QuickSort {
    public static int[] quickSort(int[] arrayToSort, int startIndex, int endIndex){
        if (startIndex < endIndex){
            int pivotInd = partition(arrayToSort, startIndex, endIndex);
            quickSort(arrayToSort, startIndex, pivotInd-1);
            quickSort(arrayToSort, pivotInd+1, endIndex);
        }
        return arrayToSort;
    }

    public static int partition(int[] arrayToSort, int startIndex, int endIndex){
        int pivotValue = arrayToSort[endIndex];
        int partitionIndex = startIndex;
        for (int i = startIndex; i < endIndex; i++){
            if (arrayToSort[i]<pivotValue){
                swap(arrayToSort, i, partitionIndex);
                partitionIndex++;
            }
        }
        swap(arrayToSort, partitionIndex, endIndex);
        return partitionIndex;
    }

    public static void swap(int []arr, int swapIndex, int endIndex){
        int temp = arr[endIndex];
        arr[endIndex] = arr[swapIndex];
        arr[swapIndex] = temp;
    }


}

/*
ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition the array by setting the position of the pivot value
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right.
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1

ALGORITHM Swap(arr, i, low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp

 */