# Blog Notes: Merge sort

Merge sort uses recursion sort each half of an input arrary. During each recursive call, a helper function is used to merge the two sorted halves together. 
  
  "Time complexity of Merge Sort is O(nLogn) in all 3 cases (worst, average and best) as merge sort always divides the array into two halves and take linear time to merge two halves." [geeksforgeeks](https://www.geeksforgeeks.org/merge-sort/)
  
  Space complexity is O(n).
  
## Learning Objectives
What a merge sort is and how it works. 

 ## Diagram
This example shows how the input array is divided in half until the subsets can no longer be divided. Then a merge function is used to sort and merge elements into ordered subsets. This continues until the complete array is merged. ![A graphical representation of merge sort](https://www.geeksforgeeks.org/wp-content/uploads/Merge-Sort-Tutorial.png)

[(Image from geeksforgeeks)](https://www.geeksforgeeks.org/merge-sort/)
  
  ## Algorithm
  1. Use recursion to divide the input array in halves until the subsets can no longer be divided (only one element in the subset)
  2. Use a merge function to sort and merge subsets
  3. Continue to do step two up the call stack until the entire array is sorted and merged
  
 ## Pseudocode
 
``` 
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
```

## Readings and References
Watch
- [Merge Sort | GeeksforGeeks](https://youtu.be/JSceec-wEyw)

Read:
- [wikipedia article on merge sort](https://en.wikipedia.org/wiki/Merge_sort)
- [geeksforgeeks article on merge sort](https://www.geeksforgeeks.org/merge-sort/)
- [tutorialspoint article on merge sort](https://www.tutorialspoint.com/data_structures_algorithms/merge_sort_algorithm.htm)
