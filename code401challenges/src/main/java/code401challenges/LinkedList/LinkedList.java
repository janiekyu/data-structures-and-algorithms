package code401challenges.LinkedList;


public class LinkedList<T> {

    // Instance variable
    public Node head;

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

    public int kthFromEnd(int k) throws Exception {
        Node current = head;
        Node currentKSpacesBack = head;
        int counter = 0;

        // if k is a negative number, throw an exception
        if (k<0){
            throw new Exception("k cannot be a negative number");
        }

        while (current.nextNode != null){
            counter ++;
            current = current.nextNode;
            if (counter > k){
                currentKSpacesBack = currentKSpacesBack.nextNode;
            }
        }

        System.out.println("current: "+ current.currentNodeValue + ", currentKSpacesBack: " +  currentKSpacesBack.currentNodeValue);

        if (counter < k){
            throw new Exception("Linked list is not long enough");
        } else {
            return (int) currentKSpacesBack.currentNodeValue;
        }

    }

    public static LinkedList<Integer> mergeLists(LinkedList<Integer> listOne, LinkedList<Integer> listTwo){
        LinkedList<Integer> newList = new LinkedList<Integer>(){};
        newList.head = listOne.head;
        Node currentOne = listOne.head.nextNode;
        Node currentTwo = listTwo.head;
        Node currentNew = listOne.head;
        int counter = 0;
        int reachedBothEnds = 0;

        while (currentTwo != null || currentOne != null){
            counter ++;

            if (counter % 2 ==1 && currentTwo != null){
                currentNew.nextNode = currentTwo;
                currentNew = currentNew.nextNode;
                currentTwo = currentTwo.nextNode;

            } else if (counter %2 == 0 && currentOne != null){
                currentNew.nextNode = currentOne;
                currentNew = currentNew.nextNode;
                currentOne = currentOne.nextNode;
            }

            //System.out.println(currentNew.currentNodeValue);
        }
        //System.out.println(newList);
        return newList;
    }


}


