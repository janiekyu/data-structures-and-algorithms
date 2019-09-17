# Code Challenge 31 - Repeated Words

[CODE](https://github.com/janiekyu/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/HashTable/HashTable.java) | [TESTS](https://github.com/janiekyu/data-structures-and-algorithms/blob/master/code401challenges/src/test/java/code401challenges/HashTable/TreeIntersectionTest.java)
- Write a function called tree_intersection that takes two binary tree parameters.
- Without utilizing any of the built-in library methods available to your language, return a set of values found in both trees.

## Algorithm
- Use in-order traversal to add values from both trees to separate ArrayLists
- Create a hash table to hold unique values from the first tree
- Iterate over the list containing values from the second tree
  - Use the .contains() method to see if any values from the second tree are in the hash table
  - If the value is found, then add it to a new list containing all the shared numbers
- Return the list of shared numbers

