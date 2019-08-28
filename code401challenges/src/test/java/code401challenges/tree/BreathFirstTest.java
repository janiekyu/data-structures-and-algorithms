package code401challenges.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BreathFirstTest {

    @Test
    public void testBreathFirst() {

        //       15
        //     /   \
        //   20    3
        //  / \   / \
        // 7  5      1

        Tree testTree = new Tree();
        Node rootNode = new Node(15);
        Node leftNode = new Node(20);
        Node rightNode = new Node(3);
        Node leftLeftNode = new Node(7);
        Node leftrightNode = new Node(5);
        Node rightrightNode = new Node(1);
        testTree.root = rootNode;
        rootNode.leftChild = leftNode;
        rootNode.rightChild = rightNode;
        leftNode.leftChild = leftLeftNode;
        leftNode.rightChild = leftrightNode;
        rightNode.rightChild = rightrightNode;

        assertEquals("[15, 20, 3, 7, 5, 1]", BreathFirst.breathFirstTraversal(testTree).toString());

    }

    @Test
    public void testBreathFirstOnlyRoot() {

        Tree testTree = new Tree();
        Node rootNode = new Node(15);

        testTree.root = rootNode;


        assertEquals("[15]", BreathFirst.breathFirstTraversal(testTree).toString());

    }

}