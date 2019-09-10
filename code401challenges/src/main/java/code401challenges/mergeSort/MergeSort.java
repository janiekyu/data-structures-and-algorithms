package code401challenges.mergeSort;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] arr){
        int n = arr.length;
        if (n>1){
            int[] left = Arrays.copyOfRange(arr, 0,(n+1)/2);
            int[] right = Arrays.copyOfRange(arr, (n+1)/2, n);
            System.out.println(Arrays.toString(left));
            System.out.println(Arrays.toString(right));

            mergeSort(left);
            mergeSort(right);

            Merge(left, right, arr);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void Merge(int[]left, int[]right, int[]arr){
        int i = 0; // index of left
        int j = 0; // index of right
        int k = 0; // index of arr

        while (i<left.length && j < right.length) {
            if (left[i] <= right[j]){ // if the
                arr[k] = left[i];
                i = i+1;
            } else {
                arr[k] = right[j];
                j=j+1;
            }
            k=k+1;
        }

        if (i==left.length){
           while (j<right.length){
                arr[k] = right[j];
                j++;
                k++;
            }
            //System.out.println("arr: " + Arrays.toString(arr) + "right " + Arrays.toString(right));
            //set remaining entries in arr to remaining values in right
        } else {
            while (i<left.length){
                arr[k] = left[i];
                i++;
                k++;
            }
            //System.out.println("arr: " + Arrays.toString(arr) + "left " + Arrays.toString(left));
            //set remaining entries in arr to remaining values in left
        }


    }

}

/*
ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length

    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1

        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left
 */