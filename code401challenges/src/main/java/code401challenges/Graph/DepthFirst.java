package code401challenges.Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirst {
    public static List<Node> depthFirstTraversal(Node root){
        List<Node> nodesInTheGraph = new ArrayList<>();
        Stack<Node> stack = new Stack<>();

        stack.push(root);

        // incomplete

        while (!stack.empty()){
            Node topOfStack = stack.peek();
            nodesInTheGraph.add(topOfStack);
            for (Object neighbor : topOfStack.neighbors.keySet()){
                Node neighborNode = (Node) neighbor;
                System.out.println(neighborNode.value);
                if (!neighborNode.visited){
                    neighborNode.visited = true;
                    nodesInTheGraph.add(neighborNode);
                    stack.push(neighborNode);
                }
                stack.pop();
            }

        }

        return nodesInTheGraph;
    }
}
