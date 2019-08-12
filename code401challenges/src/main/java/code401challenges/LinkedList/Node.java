package code401challenges.LinkedList;

public class Node<T> {
    // T refers to the generic type

    // Instance variables
    public T currentNodeValue;
    public Node nextNode;


    // Class constructor

    public Node (T valueToAdd, Node nextNode) {
        this.currentNodeValue = valueToAdd;
        this.nextNode = nextNode;
        //System.out.println("New node: " + currentNodeValue + ", Next node: " + nextNode);
    }
}
