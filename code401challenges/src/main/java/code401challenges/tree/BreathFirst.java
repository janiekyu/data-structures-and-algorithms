package code401challenges.tree;


import java.util.ArrayList;

public class BreathFirst {

    public static ArrayList<Integer> breathFirstTraversal(Tree<Integer> treeToTraverse){

        Queue<Integer> queueOfTreeItems = new Queue<>();
        queueOfTreeItems.enqueue(treeToTraverse.root);
        ArrayList<Integer> treeValues = new ArrayList<>();

        while (queueOfTreeItems.peek()!=null){
            Node<Integer> currentNode = queueOfTreeItems.dequeue();
            System.out.println(currentNode.value);
            treeValues.add(currentNode.value);
            if (currentNode.leftChild != null){
                queueOfTreeItems.enqueue(currentNode.leftChild);
            }
            if (currentNode.rightChild!=null){
                queueOfTreeItems.enqueue(currentNode.rightChild);
            }
        }

        return treeValues;


    }

}
