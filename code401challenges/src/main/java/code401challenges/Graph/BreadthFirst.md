# Implement a breadth-first traversal on a graph

## Approach & Efficiency
- Use a queue to keep track of nodes/verticies
- Enqueue the a given node
- Enter a while loop
  - Dequeue a node from the queue
  - Add that node to an array list that keeps track of the node's we've visited
  - Enqueue nodes that the dequeued node are connected to
  - Continue the steps in the while loop until there are no more items to dequeue  

