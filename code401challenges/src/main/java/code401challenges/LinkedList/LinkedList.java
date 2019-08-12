package code401challenges.LinkedList;

public class LinkedList<T> {

    // Instance variable
    public Node <T>head;

    // Constructor for the linked list
    public LinkedList(){
        this.head = null;
    }


    //Node (T valueToAdd, Node nextNode)
    public void insert(T valueToAdd){
        //create new node
        Node <T> newNode = new Node<>(valueToAdd, head);
        head = newNode;

    }
    public boolean includes(T value){
        Node<T> current = head;
        boolean exists = false;
        while (current != null) {
            if (current.currentNodeValue == value){
                exists = true;
                break;
            } else {
                current = current.nextNode;
            }
        }
        //System.out.println(exists);
        return exists;
    }

    public String toString(){
        Node<T> current = head;
        String values = "Values in linked list";
        while (current != null) {
            //System.out.println(current.currentNodeValue);
            values = values + ", " + String.valueOf(current.currentNodeValue);
            current = current.nextNode;
        }
        return values;
    }

}


