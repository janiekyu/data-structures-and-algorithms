# Trees
Binary Tree and BST Implementatio

## Challenge
- Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
- Create a Tree class with the following methods for traversals that returns an array of values: `preOrder`, `inOrder`, and `postOrder`
- Create a BinarySearchTree class with a `add` and `contains` methods

## Approach & Efficiency
Used recursion to walk through the tree for all the methods listed below. For the binary search, BigO would be O(height). For the traversing methods, BigO is O(n), since all the nodes will need to be looked at. 

## API
Tree.java methods: 
- preOrder(): returns an array with the values of the nodes in pre-order order
- inOrder(): returns an array with the values of the nodes in in-order order
- postOrder(): returns an array with the values of the nodes in post-order order

BinarySearchTree.java methods:
- add(): takes a value as parameter and adds it to the binary tree in the correct location
- contains(): takes a value as a parameter and returns true if that value is in the binary tree, false if it is not found