# Blog Notes: Insertion Sort

  An insertion sort takes in a list of values and returns the same list with the elements ordered in ascending order. The sort happens in place, meaning no additional lists are created, and requires a constant amount of memory space. The time complexity of this sort is O(kn), where n is the number of values, and k is the number of spaces each value needs to move. 
  
  Insertion sorts are easy to implement and work best with small data sets
  
## Learning Objectives
What an insertion sort is and how to use it. 

 ## Diagram
![A graphical example of insertion sort.](https://upload.wikimedia.org/wikipedia/commons/0/0f/Insertion-sort-example-300px.gif)

A graphical example of insertion sort. The partial sorted list (black) initially contains only the first element in the list. With each iteration one element (red) is removed from the input data and inserted in-place into the sorted list. [(Image and caption from wikipedia)](https://en.wikipedia.org/wiki/Insertion_sort#/media/File:Insertion-sort-example-300px.gif)
  
  ## Algorithm
  1. Starting with the second element in the list, compare it to the element before it. 
  2. If the current element is less than the previous, then switch spots. 
  3. Move on to the third element and walk the array towards the front. Shift numbers one spot to the right until you find an element that is less than the current element. 
  4. Continue to do this until you sort the last element. 
  
 ## Pseudocode
 
``` 
InsertionSort(int[] arr)
    
      FOR i = 1 to arr.length
      
        int j <-- i - 1
        int temp <-- arr[i]
        
        WHILE j >= 0 AND temp < arr[j]
          arr[j + 1] <-- arr[j]
          j <-- j - 1
          
        arr[j + 1] <-- temp
```

## Readings and References

Read:
- [wikipedia article on insertion sort](https://en.wikipedia.org/wiki/Insertion_sort)
- [tutorialspoint article on insertion sort](https://www.tutorialspoint.com/data_structures_algorithms/insertion_sort_algorithm.htm)
