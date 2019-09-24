package code401challenges.Graph;

import java.util.HashMap;

public class Node<T> {
    //instance variables
    T value;
    HashMap<Node<T>, Integer> neighbors;
    boolean visited;


    // constructor
    public Node(T value){
        this.value = value;
        this.neighbors = new HashMap<>();
        this.visited = false;
    }


    // instance methods
    public HashMap printAdjList(){
        return this.neighbors;
    }

    @Override
    public String toString() {
        return (String) this.value;
    }
}
