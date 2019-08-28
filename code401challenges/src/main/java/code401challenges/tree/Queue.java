package code401challenges.tree;


public class Queue<T> {
    // instance variables
    Node <T> front;
    Node <T> end;

    // constructor
    public Queue(){
        this.front=null;
        this.end = this.front;
    }

    public T enqueue(Node<T> nodeToAdd){
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

    public Node dequeue(){
        Node dequeuedNode = new Node();


        if (this.end == null){
            return null;
        } else {
            dequeuedNode = this.front;
            this.front = this.front.nextNode;
        }
        //System.out.println(dequeuedNode.value);
        return dequeuedNode;
    }


}
