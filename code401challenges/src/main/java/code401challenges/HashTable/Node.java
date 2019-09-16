package code401challenges.HashTable;

public class Node {
    // instance variables

    String value;
    String key;
    Node nextNode;

    // constructor

    public Node(String key, String value){
        this.key = key;
        this.value = value;
    }


    // setters

    public void setValue(String value) {
        this.value = value;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }



}
