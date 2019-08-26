package code401challenges.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void testAdd(){
        BinarySearchTree testTree = new BinarySearchTree();
        Node rootNode = new Node(50);
        Node leftNode = new Node(25);
        Node rightNode = new Node(75);
        Node leftRightNode = new Node(40);
        Node rightRightNode = new Node(100);
        testTree.root = rootNode;
        rootNode.leftChild = leftNode;
        rootNode.rightChild = rightNode;
        leftNode.rightChild = leftRightNode;
        rightNode.rightChild = rightRightNode;

        testTree.add(10);
        assertEquals("10, 25, 40, 50, 75, 100, ", BinarySearchTree.arrayListToString(testTree.inOrder()));
        testTree.add(130);
        System.out.println(BinarySearchTree.arrayListToString(testTree.inOrder()));
        assertEquals("10, 25, 40, 50, 75, 100, 130, ", BinarySearchTree.arrayListToString(testTree.inOrder()));
        testTree.add(5);
        assertEquals("5, 10, 25, 40, 50, 75, 100, 130, ", BinarySearchTree.arrayListToString(testTree.inOrder()));

    }

    @Test
    public void testContains(){
        BinarySearchTree testTree = new BinarySearchTree();
        Node rootNode = new Node(50);
        Node leftNode = new Node(25);
        Node rightNode = new Node(75);
        Node leftRightNode = new Node(40);
        Node rightRightNode = new Node(100);
        testTree.root = rootNode;
        rootNode.leftChild = leftNode;
        rootNode.rightChild = rightNode;
        leftNode.rightChild = leftRightNode;
        rightNode.rightChild = rightRightNode;

        assertFalse(testTree.contains(30));
        assertTrue(testTree.contains(25));
        assertTrue(testTree.contains(100));


    }

}