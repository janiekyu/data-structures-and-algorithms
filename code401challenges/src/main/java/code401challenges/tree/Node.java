package code401challenges.tree;

public class Node {

    // instance variables
    int value;
    Node leftChild;
    Node rightChild;

    // constructor
    public Node (int value, Node leftChild, Node rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public Node (int value){
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }


}

