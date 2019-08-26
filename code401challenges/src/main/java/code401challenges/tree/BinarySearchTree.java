package code401challenges.tree;

import java.util.ArrayList;

public class BinarySearchTree extends Tree {

    public BinarySearchTree(Node root) {
        super(root);
    }

    public BinarySearchTree() {
        this.root=null;
    }


    // instance method

    public void add(int valueToAdd){

        Node nodeToAdd = new Node(valueToAdd);

        // look at value of root, if value is less than value, go left, if value is greater than value to right
        addHelper(this.root, nodeToAdd);



    }

    public void addHelper(Node node, Node nodeToAdd){
        //look at the left node
            if (nodeToAdd.value < node.value){

                if (node.leftChild == null){
                    node.leftChild = nodeToAdd;

                } else {
                    addHelper(node.leftChild, nodeToAdd);
                }
            }

            if (nodeToAdd.value > node.value){
                if (node.rightChild == null){
                    node.rightChild = nodeToAdd;

                } else {
                    addHelper(node.rightChild, nodeToAdd);
                }
             }

    }

    // class methods

    public static String arrayListToString(ArrayList list){
        String outputString = "";
        for (int i = 0; i < list.size(); i++){
            outputString = outputString + list.get(i)+ ", ";
        }
        return outputString;
    }

}
