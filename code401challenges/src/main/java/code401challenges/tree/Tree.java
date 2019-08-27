package code401challenges.tree;

import java.util.ArrayList;
import java.util.Arrays;

public class Tree <T> {

    // instance variables
    Node <T> root;

    // constructor
    public Tree(Node root) {
        this.root = root;
    }

    public Tree() {
        this.root = null;
    }

    // instance methods

    public ArrayList<T> preOrder(){
        ArrayList<T> outputList = new ArrayList<>();
        preOrderHelper(this.root, outputList);
        //System.out.println("hello" + arrayListToString(outputList));
        return outputList;
    }

    private void preOrderHelper(Node node, ArrayList outputList){

        outputList.add(node.value);

        if (node.leftChild != null){
            preOrderHelper(node.leftChild, outputList);
        }
        if (node.rightChild != null){
            preOrderHelper(node.rightChild, outputList);
        }

    }



     public ArrayList<T> inOrder(){
        ArrayList<T> outputList = new ArrayList<>();
        inOrderHelper(this.root, outputList);
        return outputList;
    }

    private void inOrderHelper(Node node, ArrayList outputList){

        if (node.leftChild != null){
            inOrderHelper(node.leftChild, outputList);
        }
        outputList.add(node.value);

        if (node.rightChild != null){
            inOrderHelper(node.rightChild, outputList);
        }
    }


    public ArrayList<T> postOrder(){
        ArrayList<T> outputList = new ArrayList<>();
        postOrderHelper(this.root, outputList);
        return outputList;
    }

    private void postOrderHelper(Node node, ArrayList outputList){

        if (node.leftChild != null){
            postOrderHelper(node.leftChild, outputList);
        }

        if (node.rightChild != null){
            postOrderHelper(node.rightChild, outputList);
        }

        outputList.add(node.value);
    }



    // class methods

    public static String arrayListToString(ArrayList list){
        String outputString = "";
        for (int i = 0; i < list.size(); i++){
            outputString = outputString + list.get(i);
        }
        return outputString;
    }
}
