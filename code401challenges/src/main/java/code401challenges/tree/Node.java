package code401challenges.tree;

public class Node <T> {

    // instance variables
    T value;
    Node leftChild;
    Node rightChild;

    // constructor
    public Node (T value, Node leftChild, Node rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public Node (T value){
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }


}

