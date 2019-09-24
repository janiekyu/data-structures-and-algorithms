package code401challenges.Graph;

import java.util.HashMap;

public class Node<T> {
    //instance variables
    T value;
    HashMap<Node<T>, Integer> neighbors;


    // constructor
    public Node(T value){
        this.value = value;
        this.neighbors = new HashMap<>();
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
