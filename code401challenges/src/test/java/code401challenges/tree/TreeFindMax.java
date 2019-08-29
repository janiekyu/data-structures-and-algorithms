package code401challenges.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreeFindMax {
    @Test public void testFindMax(){

        //       3
        //     /   \
        //   12    20
        //  / \   / \
        // 5  6     25

        Tree <Integer> testTree = new Tree();
        Node rootNode = new Node(3);
        Node leftNode = new Node(12);
        Node rightNode = new Node(20);
        Node leftLeftNode = new Node(5);
        Node leftrightNode = new Node(6);
        Node rightrightNode = new Node(25);
        testTree.root = rootNode;
        rootNode.leftChild = leftNode;
        rootNode.rightChild = rightNode;
        leftNode.leftChild = leftLeftNode;
        leftNode.rightChild = leftrightNode;
        rightNode.rightChild = rightrightNode;

        System.out.println(testTree.findMaximumValue());



    }

}