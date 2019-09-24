package code401challenges.Graph;

public class Stack<T> {
    // instance variables
    QueueNode <T> top;

    // constructor
    public Stack(){
        top = null;
    }

    public T pop(){
        //Define a method called pop that does not take any argument, removes the node from the top of the stack, and returns the node’s value.
        if (this.top != null){
            //System.out.println("Old top: " + top.value);
            T valueToReturn = top.value;
            if (this.top.nextNode != null){

                this.top = this.top.nextNode;

            } else {

                this.top = null;
            }
            return valueToReturn;

        } else {
            throw new NullPointerException("You cannot pop an empty list");
        }
    }

    public T push(T valueOfNodeToAdd){
        //Define a method called push which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.
        QueueNode<T> nodeToAdd = new QueueNode<T>(valueOfNodeToAdd);
        nodeToAdd.nextNode = top;
        this.top = nodeToAdd;
        return nodeToAdd.value;
    }

    public T peek(){
        if (this.top!=null){
            return (T) this.top.value;
        } else {
            return null;
        }
    }
}
