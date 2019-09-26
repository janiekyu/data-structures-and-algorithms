package code401challenges.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirst {
    public static List<Integer> breadthFirstTraversal(Node root){
        Queue q = new LinkedList();
        List<Integer> valueList = new ArrayList<>();
        q.add(root);
        Node current;

        while (!q.isEmpty()){
            current = q.remove();
        }


        return valueList;
    }
}
