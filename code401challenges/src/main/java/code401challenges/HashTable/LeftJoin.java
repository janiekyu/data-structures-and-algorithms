package code401challenges.HashTable;

import java.util.ArrayList;

public class LeftJoin {
    public static ArrayList<ArrayList> leftJoin(HashTable left, HashTable right) {
        ArrayList<ArrayList> joined = new ArrayList<>();
        for (Node currentNode : left.map) {
            if (currentNode !=null){
                ArrayList<String> joinRow = new ArrayList<>();
                joinRow.add(currentNode.key);
                joinRow.add(currentNode.value);
            if (right.contains(currentNode.key)) {
                int hashedKey = hashTheKey(currentNode.key, right.map.length);
                Node rightNode = right.map[hashedKey];
                while (rightNode != null) {
                    joinRow.add(rightNode.value);
                    //left.set(currentNode.key, rightNode.value);
                    //System.out.println("Add " + rightNode.value+ " to " + currentNode.key);
                    rightNode = rightNode.nextNode;
                }

            } else {
                left.set(currentNode.key, null);
                joinRow.add(null);
            }
                joined.add(joinRow);
            }
        }
        return joined;
    }


    // helper function to hash the key
    private static int hashTheKey(String key, int length) {
        int hashValue = 0;
        char[] letters = key.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            hashValue += letters[i];
        }
        hashValue = (hashValue * 599) % length;
        return hashValue;
    }

    public static void printHashTable(HashTable ht){
        for (Node node: ht.map){
            if(node !=null){
            System.out.println(node.key);
            Node currentNode = node;
            while (currentNode != null){
                System.out.println("--" + currentNode.value);
                currentNode = currentNode.nextNode;
            }}
        }
        return;
    }
}
