package code401challenges.Graph;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BreadthFirstTest {
    Graph <String> places = new Graph();
    Node nodeA = new Node("Pandora");
    Node nodeB = new Node("Arendelle");
    Node nodeC = new Node ("Metroville");
    Node nodeD = new Node ("Monstroplolis");
    Node nodeE = new Node ("Narnia");
    Node nodeF = new Node ("Naboo");

    @Before
    public void beforeTests(){
        places.AddNode(nodeA);
        places.AddNode(nodeB);
        places.AddNode(nodeC);
        places.AddNode(nodeD);
        places.AddNode(nodeE);
        places.AddNode(nodeF);

        places.AddEdge(nodeA, nodeB);
        places.AddEdge(nodeB, nodeC);
        places.AddEdge(nodeB, nodeD);
        places.AddEdge(nodeC, nodeD);
        places.AddEdge(nodeC, nodeE);
        places.AddEdge(nodeF, nodeC);
        places.AddEdge(nodeC, nodeF);
        places.AddEdge(nodeD, nodeF);
        places.AddEdge(nodeE, nodeF);
    }

    @Test
    public void testConnections(){
        assertEquals(6, places.Size());
        System.out.println(nodeA.value + " neighbors: " + nodeA.neighbors);
        System.out.println(nodeB.value + " neighbors: " +nodeB.neighbors);
        System.out.println(nodeC.value + " neighbors: " +nodeC.neighbors);
        System.out.println(nodeD.value + " neighbors: " +nodeD.neighbors);
        System.out.println(nodeE.value + " neighbors: " +nodeE.neighbors);
        System.out.println(nodeF.value + " neighbors: " +nodeF.neighbors);
    }

    @Test
    public void testTraversal(){

        //assertEquals(new List[], BreadthFirst.BreadthFirstTraversal(nodeA).toArray());
    }

}