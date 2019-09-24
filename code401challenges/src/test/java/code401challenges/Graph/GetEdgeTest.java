package code401challenges.Graph;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

public class GetEdgeTest {

    Graph <String> places = new Graph();
    Node pan = new Node("Pandora");
    Node are = new Node("Arendelle");
    Node met = new Node ("Metroville");
    Node mon = new Node ("Monstroplolis");
    Node nar = new Node ("Narnia");
    Node nab = new Node ("Naboo");

    @Before
    public void beforeTests(){
        places.AddNode(pan);
        places.AddNode(are);
        places.AddNode(met);
        places.AddNode(mon);
        places.AddNode(nar);
        places.AddNode(nab);

        places.AddEdge(pan, are, 150);
        places.AddEdge(pan, met, 82);
        places.AddEdge(are, met, 99);
        places.AddEdge(are, mon, 42);
        places.AddEdge(met, nar, 37);
        places.AddEdge(met, nab, 26);
        places.AddEdge(met, mon, 105);
        places.AddEdge(nar, nab, 250);
        places.AddEdge(mon, nab, 73);
    }

    @Test
    public void testDirectPath(){
        Node[] path = new Node[]{pan, are};
        assertEquals("True, $150", GetEdge.travelPossible(path));
    }

    @Test
    public void testThreeDestinationPath(){
        Node[] path = new Node[]{pan, met, nab};
        assertEquals("True, $108", GetEdge.travelPossible(path));
    }

    @Test
    public void testImpossiblePath(){
        Node[] path = new Node[]{pan, met, nab, are};
        assertEquals("False, $0", GetEdge.travelPossible(path));
    }

}