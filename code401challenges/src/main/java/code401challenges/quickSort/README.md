# Blog Notes: Quick sort

Quick sort is a comparision algorithm that uses a pivot value to efficiently sort a set of values in ascending order. Numbers smaller than the pivot are placed to the left of the pivot, and numbers greater than are placed to the right. The array is then recursively divided and reordered around a new pivot. The end result will be the original array with the values sorted.
  
  Quick sort operates in place on the array, so the space complexity is O(n). In the worst case, the time complexity of a quick sort is O(n*n).
  
## Learning Objectives
What a quick sort is and how it works. 

 ## Diagram
Full example of quicksort on a random set of numbers. The shaded element is the pivot. It is always chosen as the last element of the partition. However, always choosing the last element in the partition as the pivot in this way results in poor performance (O(n²)) on already sorted arrays, or arrays of identical elements. Since sub-arrays of sorted / identical elements crop up a lot towards the end of a sorting procedure on a large set, versions of the quicksort algorithm that choose the pivot as the middle element run much more quickly than the algorithm described in this diagram on large sets of numbers. (Text and image from [wikipedia](https://en.wikipedia.org/wiki/Quicksort))

![A graphical representation of quick sort](https://upload.wikimedia.org/wikipedia/commons/thumb/a/af/Quicksort-diagram.svg/400px-Quicksort-diagram.svg.png)

[(Image from geeksforgeeks)](https://www.geeksforgeeks.org/merge-sort/)
  
  ## Algorithm
  1. Pick a pivot
  2. Partition the array so that all the values less than the pivot are to the left of the pivot and all the values greater are to the right
  3. Recursively repeat steps 1 & 2 on the portion of the array to the left and to the right of the pivot, until the array can no longer be partitioned (length of array is 2)
  
 ## Pseudocode
 
``` 
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
```

## Readings and References
Watch
- [Quicksort algorithm - mycodeschool](https://youtu.be/COk73cpQbFQ)

Read:
- [wikipedia article on quick sort](https://en.wikipedia.org/wiki/Quicksort)
- [geeksforgeeks article on quick sort](https://www.geeksforgeeks.org/quick-sort/)