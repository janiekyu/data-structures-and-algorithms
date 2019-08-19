# Stacks and Queues
Implement a Stack and a Queue Data Structure

## Challenge
Within a `stacksandqueues` package, create the following classes: 
- A Node class: has properties for the value stored in the Node, and a pointer to the next node.
- A Stack class that has a `top` property. It creates an empty Stack when instantiated.
- Create a Queue class that has a `front` property. It creates an empty Queue when instantiated.

## Code
### [Lab code](https://github.com/janiekyu/data-structures-and-algorithms/tree/master/code401challenges/src/main/java/stacksandqueues)

Tests: [Stack](https://github.com/janiekyu/data-structures-and-algorithms/blob/master/code401challenges/src/test/java/stacksandqueues/StackTest.java) | [Queue](https://github.com/janiekyu/data-structures-and-algorithms/blob/master/code401challenges/src/test/java/stacksandqueues/QueueTest.java)

## API
### Queue
- enqueue(): takes in a value as an argument, creates a new node with that argument as its value, and add it at the end of the queue. 
- peek(): returns the value of the node at the front of the queue. If the queue is empty, a value of null will be returned. This method does not take in any arguments. 
- dequeue():mremoves the node at the front of the queue and returns the value of that node. The next node is then set as the front of the queue. This method does not take in any arguments. 

### Stack
- pop(): removes the node at the top of the stack and returns the value of that node. The next node is then set as the top of the stack. This method does not take in any arguments. 
- push(): takes in a value as an argument, creates a new node with that argument as its value, and add it at the top of the stack. 
- peek(): returns the value of the node at top of the stack. If the stack is empty, a value of null will be returned. This method does not take in any arguments. 