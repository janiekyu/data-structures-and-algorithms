package code401challenges.Graph;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DepthFirstTest {

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
    public void testTraversal(){
        System.out.println(DepthFirst.depthFirstTraversal(nodeA));
    }
}