# Lab 05: Linked Lists

## Challenge
Implement a Singly Linked List Data Structure:
- Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node
- Within your LinkedList class, include a head property

## Approach & Efficiency
- Create a link list class (properties: head)
- Create a node class (properties: value & nextNode)
- When an instance of the link list class is created, the head (which of the type Node) will be null
- When a new node is created, it will be inserted at the beginning of the list, and head will point to the new node

## Solution
[Code](https://github.com/janiekyu/data-structures-and-algorithms/tree/master/code401challenges/src/main/java/code401challenges/LinkedList) | [Test](https://github.com/janiekyu/data-structures-and-algorithms/blob/master/code401challenges/src/test/java/code401challenges/LinkedList/LinkedListTest.java)