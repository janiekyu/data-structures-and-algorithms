package code401challenges.HashTable;
import code401challenges.tree.Tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TreeIntersection {

    public static List<Integer> treeIntersection(Tree treeA, Tree treeB){
        ArrayList<Integer> treeAValues = treeA.inOrder();
        ArrayList<Integer> treeBValues = treeB.inOrder();
        List<Integer> intersection = new ArrayList<>();
        HashTable treeAHashTable = new HashTable(100);

        // Hash numbers in treeA as keys in the hash table
        for (Integer num : treeAValues){
            if (treeAHashTable.contains(num.toString())==false){
                treeAHashTable.set(num.toString(), "hi");
            }
        }

        // Check numbers in treeB to see if they are in the hash table
        for (Integer num : treeBValues){
            if (treeAHashTable.contains(num.toString())==true){
                intersection.add(num);
            }
        }
        System.out.println(intersection.toString());
        return intersection;

    }

}
