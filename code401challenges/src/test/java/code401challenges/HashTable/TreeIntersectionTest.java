package code401challenges.HashTable;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeIntersectionTest {
    @Test
    public void testTree(){
        Node<Integer> rightRightA = new Node(2);
        Node<Integer> rightLeftA = new Node(18);
        Node<Integer> leftRightA = new Node(10);
        Node<Integer> leftLeftA = new Node(9);
        Node<Integer> rightA = new Node(8, rightLeftA, rightRightA);
        Node<Integer> leftA = new Node(12, leftLeftA, leftRightA);
        Node<Integer> rootA = new Node(5, leftA, rightA);
        Tree<Integer> treeA = new Tree<>(rootA);


        Node<Integer> rightRightB = new Node(0);
        Node<Integer> rightLeftB = new Node(13);
        Node<Integer> leftRightB = new Node(7);
        Node<Integer> leftLeftB = new Node(8);
        Node<Integer> rightB = new Node(2, rightLeftB, rightRightB);
        Node<Integer> leftB = new Node(10, leftLeftB, leftRightB);
        Node<Integer> rootB = new Node(11, leftB, rightB);
        Tree<Integer> treeB = new Tree<>(rootB);

        System.out.println("B"+treeB.inOrder().toString());
        System.out.println("A"+treeA.inOrder().toString());

        TreeIntersection.treeIntersection(treeA, treeB);
    }

    @Test
    public void testTreeNoDups(){
        Node<Integer> rightRightA = new Node(1);
        Node<Integer> rightLeftA = new Node(2);
        Node<Integer> leftRightA = new Node(3);
        Node<Integer> leftLeftA = new Node(4);
        Node<Integer> rightA = new Node(5, rightLeftA, rightRightA);
        Node<Integer> leftA = new Node(6, leftLeftA, leftRightA);
        Node<Integer> rootA = new Node(7, leftA, rightA);
        Tree<Integer> treeA = new Tree<>(rootA);


        Node<Integer> rightRightB = new Node(8);
        Node<Integer> rightLeftB = new Node(9);
        Node<Integer> leftRightB = new Node(10);
        Node<Integer> leftLeftB = new Node(11);
        Node<Integer> rightB = new Node(12, rightLeftB, rightRightB);
        Node<Integer> leftB = new Node(13, leftLeftB, leftRightB);
        Node<Integer> rootB = new Node(14, leftB, rightB);
        Tree<Integer> treeB = new Tree<>(rootB);

        System.out.println("B"+treeB.inOrder().toString());
        System.out.println("A"+treeA.inOrder().toString());

        TreeIntersection.treeIntersection(treeA, treeB);
    }

    @Test
    public void testTreeDups(){
        Node<Integer> rightRightA = new Node(1);
        Node<Integer> rightLeftA = new Node(1);
        Node<Integer> leftRightA = new Node(12);
        Node<Integer> leftLeftA = new Node(12);
        Node<Integer> rightA = new Node(0, rightLeftA, rightRightA);
        Node<Integer> leftA = new Node(0, leftLeftA, leftRightA);
        Node<Integer> rootA = new Node(14, leftA, rightA);
        Tree<Integer> treeA = new Tree<>(rootA);

        Node<Integer> rightB = new Node(12);
        Node<Integer> leftB = new Node(13);
        Node<Integer> rootB = new Node(14, leftB, rightB);
        Tree<Integer> treeB = new Tree<>(rootB);

        System.out.println("B"+treeB.inOrder().toString());
        System.out.println("A"+treeA.inOrder().toString());

        TreeIntersection.treeIntersection(treeA, treeB);
    }

}