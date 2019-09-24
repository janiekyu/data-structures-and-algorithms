package code401challenges.Graph;


public class Queue<T> {
    // instance variables
    QueueNode <T> front;
    QueueNode<T> end;

    // constructor
    public Queue (){
        this.front=null;
        this.end = this.front;
    }

    public T enqueue(Node vertexToAdd){

        QueueNode nodeToAdd = new QueueNode(vertexToAdd);

        if (this.front==null){
            this.front = nodeToAdd;
            this.end = nodeToAdd;
        } else {
            this.end.nextNode = nodeToAdd;
            this.end = nodeToAdd;
        }

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
        QueueNode<T> current = this.front;
        String queueValues = "";
        while (current != null){
            queueValues = queueValues + current.value + " ";
            current = current.nextNode;
        }
        return queueValues.trim();
    }
}
