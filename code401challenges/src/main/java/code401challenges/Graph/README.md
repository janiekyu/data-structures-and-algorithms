# Graphs

## Challenge
Graph Implementation

## API
- ```AddNode()```: 
  - Adds a new node to the graph
  - Takes in the value of that node
  - Returns the added node
- ```AddEdge()```
  - Adds a new edge between two nodes in the graph
  - Include the ability to have a “weight”
  - Takes in the two nodes to be connected by the edge
  - Both nodes should already be in the Graph
- ```GetNodes()```
  - Returns all of the nodes in the graph as a collection (set, list, or similar)
- ```GetNeighbors()```
  - Returns a hashmap of nodes connected to the given node. The key is the the node, and the weight is the value.
  - Takes in a given node
- ```Size()```
  -Returns the total number of nodes in the graph