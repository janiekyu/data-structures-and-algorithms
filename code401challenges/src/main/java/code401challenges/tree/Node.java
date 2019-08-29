package code401challenges.tree;

public class Node <T> {

    // instance variables
    T value;
    Node <T> leftChild;
    Node <T> rightChild;
    Node <T> nextNode;

    // constructor
    public Node (T value, Node leftChild, Node rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.nextNode = null;
    }

    public Node (T value){
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
        this.nextNode = null;
    }

    public Node (){
    }


}

