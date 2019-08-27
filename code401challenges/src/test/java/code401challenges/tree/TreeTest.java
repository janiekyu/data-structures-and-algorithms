package code401challenges.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {


    @Test public void testCreateEmptyTree(){
        Tree<Integer> emtpyTree = new Tree();
        assertNotNull(emtpyTree);
    }

    @Test public void testAddNodes(){
        Tree testTree = new Tree();
        Node rootNode = new Node(1);
        Node leftNode = new Node(2);
        Node rightNode = new Node(3);

        testTree.root = rootNode;
        rootNode.leftChild = leftNode;
        rootNode.rightChild = rightNode;


        assertEquals(1, testTree.root.value);
        assertEquals(2, testTree.root.leftChild.value);
        assertEquals(3, testTree.root.rightChild.value);
    }

    @Test public void testPreOrder(){
        Tree testTree = new Tree();
        Node rootNode = new Node(1);
        Node leftNode = new Node(2);
        Node rightNode = new Node(3);
        Node leftLeftNode = new Node(4);
        Node leftrightNode = new Node(5);
        testTree.root = rootNode;
        rootNode.leftChild = leftNode;
        rootNode.rightChild = rightNode;
        leftNode.leftChild = leftLeftNode;
        leftNode.rightChild = leftrightNode;

        String output = Tree.arrayListToString(testTree.preOrder());

        assertEquals("12453", output);

    }

    @Test public void testInOrder(){
        Tree testTree = new Tree();
        Node rootNode = new Node(1);
        Node leftNode = new Node(2);
        Node rightNode = new Node(3);
        testTree.root = rootNode;
        rootNode.leftChild = leftNode;
        rootNode.rightChild = rightNode;

        String output = Tree.arrayListToString(testTree.inOrder());

        assertEquals("213", output);
    }

    @Test public void postInOrder(){
        Tree testTree = new Tree();
        Node rootNode = new Node(1);
        Node leftNode = new Node(2);
        Node rightNode = new Node(3);
        testTree.root = rootNode;
        rootNode.leftChild = leftNode;
        rootNode.rightChild = rightNode;

        String output = Tree.arrayListToString(testTree.postOrder());

        assertEquals("231", output);
    }


}