package code401challenges.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {
    @Test public void testFizzBuzz(){

        //       15
        //     /   \
        //   20    3
        //  / \   / \
        // 7  5

        Tree testTree = new Tree();
        Node rootNode = new Node(15);
        Node leftNode = new Node(20);
        Node rightNode = new Node(3);
        Node leftLeftNode = new Node(7);
        Node leftrightNode = new Node(5);
        testTree.root = rootNode;
        rootNode.leftChild = leftNode;
        rootNode.rightChild = rightNode;
        leftNode.leftChild = leftLeftNode;
        leftNode.rightChild = leftrightNode;

        FizzBuzzTree.fizzBuzzTree(testTree);
        assertEquals("[7, Buzz, Buzz, FizzBuzz, Fizz]", testTree.inOrder().toString());

    }
}