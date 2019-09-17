package code401challenges.HashTable;

public class HashTable {

    // instance variable
    Node[] map;

    // constructor
    public HashTable(int size){
        map = new Node[size];
    }

    // helper function to hash the key
    private int hashTheKey(String key){
        int hashValue = 0;
        char[] letters=key.toCharArray();
        for (int i =0; i<letters.length; i++){
            hashValue += letters[i];
        }
        hashValue = (hashValue * 599) % this.map.length;
        return hashValue;
    }

    // add a key/value pair to the hashtable

    public void set(String key, String value){
        int hashedKey= hashTheKey(key);

        if (this.map[hashedKey] == null){
            this.map[hashedKey] = new Node(key, value);
            //System.out.println(map[hashedKey].key + ": " + hashedKey);
        } else{
            Node temp = this.map[hashedKey];
            this.map[hashedKey] = new Node(key, value);
            this.map[hashedKey].nextNode = temp;
            //System.out.println(map[hashedKey].key + ": " + hashedKey + ", next: " + map[hashedKey].nextNode.key);
        }
    }

    // get the value for the given key

    public String get(String key){
        int hashedKey = hashTheKey(key);
        Node nodeToCheck = this.map[hashedKey];
        while (nodeToCheck != null){
            if (nodeToCheck.key.equals(key)) {
                //System.out.println(key + ": " + nodeToCheck.value);
                return nodeToCheck.value;
            } else {
                nodeToCheck = nodeToCheck.nextNode;
            }
        }
        //System.out.println(key + " not found");
        return "end of list and not found";
    }

    // checks if key is in the map

    public boolean contains(String key){
        int hashedKey = hashTheKey(key);
        Node nodeToCheck = this.map[hashedKey];
        while (nodeToCheck != null){
            if (nodeToCheck.key.equals(key)) {
                //System.out.println(key + " found!");
                return true;
            } else {
                nodeToCheck = nodeToCheck.nextNode;
            }
        }
        //System.out.println(key + " not found =(");
        return false;
    }
}
