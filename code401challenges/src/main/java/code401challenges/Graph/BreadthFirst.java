package code401challenges.Graph;

import java.util.ArrayList;
import java.util.List;

public class BreadthFirst {

    public static List<Node> BreadthFirstTraversal(Node root){
        List<Node> orderVisited = new ArrayList<>();
        Queue<Node> nodesToVisit = new Queue<>();
        nodesToVisit.enqueue(root);
        //System.out.println(nodesToVisit.peek());

        while (nodesToVisit.peek() != null){
            Node front = nodesToVisit.dequeue();
            orderVisited.add(front);
            //System.out.println(front);
            //front.visited = true;

            for (Object neighbor: front.neighbors.keySet()){
                Node neighborNode = (Node) neighbor;
                if (!neighborNode.visited){
                    neighborNode.visited = true;
                    nodesToVisit.enqueue(neighborNode);
                }
            }

        }

        return orderVisited;
    }


}
