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

    public void append(T value) {
        Node<T> current = head;
        Node<T> previous = null;
        while (current != null){
            previous = current;
            current = current.nextNode;
        }
        Node<T> nodeToAppend = new Node<> (value, previous.nextNode);
        previous.nextNode = nodeToAppend;
    }

    public void insertBefore(T valueToFind, T valueToAdd){

        // if the node that holds the given value is in the first node,
        // call the insert() method and exit the method
        if (head.currentNodeValue == valueToFind){
            insert(valueToAdd);
            return;
        }

        Node<T> current = head;
        Node<T> previous = new Node<>(null, null);

        while (current.currentNodeValue != valueToFind){
            if (current.nextNode == null){
                // If the value is not in linked list exit the method
                System.out.println("Value not in list");
                return;
            } else {
                previous = current;
                current = current.nextNode;
            }
        }

        Node<T> nodeToAppend = new Node<> (valueToAdd, previous.nextNode);
        previous.nextNode = nodeToAppend;
    }

    public void insertAfter (T valueToFind, T valueToAdd){
        Node current = head;
        Node next = head.nextNode;

        while (current != null) {
            //System.out.println("current: " + current.currentNodeValue);
            if (current.currentNodeValue == valueToFind) {
                //System.out.println("Found value");
                Node<T> newNode = new Node<>(valueToAdd, current.nextNode);
                current.nextNode = newNode;
                return;
            } else {
                //System.out.println("Still Looking");
                current = current.nextNode;
            }
        }
    }

}


