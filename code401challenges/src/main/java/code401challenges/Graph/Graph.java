package code401challenges.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Graph<T> {
    // instance variables
    List <Node <T>> adjacencyList = new ArrayList<>();

    // constructor
    public Graph(){
        adjacencyList = new ArrayList<>();
    }

    // instance methods

    public Node AddNode(Node<T> nodeToAdd){

        if (!this.adjacencyList.contains(nodeToAdd)) {
            this.adjacencyList.add(nodeToAdd);
        }
        return nodeToAdd;
    }

    public static void AddEdge(Node fromNode, Node toNode, int weight){
        fromNode.neighbors.put(toNode, weight);
    }

    public static void AddEdge(Node fromNode, Node toNode){
        fromNode.neighbors.put(toNode, 0);
    }

    public List<Node<T>> GetNodes(){
        return this.adjacencyList;
    }

    public String printAdjList(){
        return Arrays.toString(this.adjacencyList.toArray());

    }

    public int Size(){
        return this.adjacencyList.size();
    }




}

