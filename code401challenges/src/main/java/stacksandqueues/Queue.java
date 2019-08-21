package stacksandqueues;

public class Queue<T> {
    // instance variables
    Node <T> front;
    Node <T> end;

    // constructor
    public Queue (){
        this.front=null;
        this.end = this.front;
    }

    public T enqueue(T valueOfNodeToAdd){
        //Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
        Node<T> nodeToAdd = new Node<T>(valueOfNodeToAdd);

        if (this.front==null){
            this.front = nodeToAdd;
            this.end = nodeToAdd;
        } else {
            this.end.nextNode = nodeToAdd;
            this.end = nodeToAdd;
        }

        return this.end.value;
    }

    public T enqueue(Animal<T> animalToAdd){
        //Overloaded method

        if (this.front==null){
            this.front = animalToAdd;
            this.end = animalToAdd;
        } else {
            this.end.nextNode = animalToAdd;
            this.end = animalToAdd;
        }
        //System.out.println(this.end.value);
        return this.end.value;
    }

    public T peek(){
        if (this.front != null){
            return this.front.value;
        } else {
            return null;
        }
    }

    public T dequeue(){
        //Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.
        T valueOfDequeuedNode;
        if (this.end == null){
            throw new NullPointerException("You cannot dequeue an empty list");
        } else {
            valueOfDequeuedNode = this.front.value;
            this.front = this.front.nextNode;
            //System.out.println("The new front is: " + this.front.value);
        }

        return valueOfDequeuedNode;
    }

    public String walkTheQueue(){
        Node <T> current = this.front;
        String queueValues = "";
        while (current != null){
            queueValues = queueValues + current.value + " ";
            current = current.nextNode;
        }
        return queueValues.trim();
    }
}
