package code401challenges.Graph;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GraphTest {

    Graph <String>testGraph = new Graph();
    Node nodeA = new Node("A");
    Node nodeB = new Node("B");
    Node nodeC = new Node("C");
    Node nodeD = new Node("D");
    Node nodeE = new Node("E");


    @Test
    public void testAddtoGraph(){
        testGraph.AddNode(nodeA);
        testGraph.AddNode(nodeB);
        testGraph.AddNode(nodeC);
        assertEquals("[A, B, C]", testGraph.printAdjList());
    }

    @Test
    public void testAddEdge(){
        testGraph.AddNode(nodeA);
        testGraph.AddNode(nodeB);
        testGraph.AddNode(nodeC);

        testGraph.AddEdge(nodeA, nodeB, 3);
        testGraph.AddEdge(nodeA, nodeC, 1);
        testGraph.AddEdge(nodeA, nodeD);

        assertEquals(0, nodeA.neighbors.get(nodeD));
        assertEquals(1, nodeA.neighbors.get(nodeC));
    }

    @Test
    public void testAllMNodes(){
        testGraph.AddNode(nodeA);
        testGraph.AddNode(nodeB);
        testGraph.AddNode(nodeC);
        testGraph.AddNode(nodeD);
        testGraph.AddNode(nodeE);

        List <Node> comparisonList = new ArrayList<Node>();
        comparisonList.add(nodeA);
        comparisonList.add(nodeB);
        comparisonList.add(nodeC);
        comparisonList.add(nodeD);
        comparisonList.add(nodeE);

        assertArrayEquals(comparisonList.toArray(), testGraph.GetNodes().toArray());
    }


    @Test
    public void testNeighbots(){
        testGraph.AddNode(nodeA);
        testGraph.AddNode(nodeB);
        testGraph.AddNode(nodeC);
        testGraph.AddNode(nodeD);
        testGraph.AddNode(nodeE);

        testGraph.AddEdge(nodeA, nodeB, 3);
        testGraph.AddEdge(nodeA, nodeC, 1);
        testGraph.AddEdge(nodeA, nodeD);

        testGraph.AddEdge(nodeC, nodeB, 3);
        testGraph.AddEdge(nodeC, nodeD, 2);
        testGraph.AddEdge(nodeC, nodeE);

        System.out.println(nodeA.neighbors.entrySet());
        assertTrue(nodeA.neighbors.containsKey(nodeB));
        assertTrue(nodeA.neighbors.containsKey(nodeC));
        assertTrue(nodeA.neighbors.containsKey(nodeD));
        assertFalse(nodeA.neighbors.containsKey(nodeE));

        System.out.println(nodeC.neighbors.entrySet());

    }

    @Test
    public void testSize(){
        testGraph.AddNode(nodeA);
        testGraph.AddNode(nodeB);
        testGraph.AddNode(nodeC);
        testGraph.AddNode(nodeD);
        testGraph.AddNode(nodeE);

        assertEquals(5, testGraph.Size());

    }
}