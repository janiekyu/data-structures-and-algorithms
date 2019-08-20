package stacksandqueues;

public class PseudoQueue<T> {

    // instance variables
    Stack<T> dQStack;
    Stack<T> enQStack;

    // constructor
    public PseudoQueue(){
        dQStack = new <T> Stack();
        enQStack = new <T> Stack();
    }

    public T enqueue(T valueToAdd) throws Exception{
        Stack <T> stackHoldingNodes = this.whichStackHasNodes();
        if (stackHoldingNodes == this.dQStack){
            this.switchStack(stackHoldingNodes);
        }
        return this.enQStack.push(valueToAdd);
    }

    public T dequeue() throws Exception{
        Stack <T> stackHoldingNodes = this.whichStackHasNodes();
        if (stackHoldingNodes == this.enQStack){
            this.switchStack(stackHoldingNodes);
            return this.dQStack.pop();
        } else if (stackHoldingNodes == this.dQStack) {
            return this.dQStack.pop();
        } else {
            throw new Exception("Error: cannot dequeue an empty psuedo queue");
        }
    }

    // helper functions

    public Stack <T> whichStackHasNodes() throws Exception{
        if (this.dQStack.top == null && this.enQStack.top == null){
            return null;
        } else if (this.dQStack.top == null){
            return this.enQStack;
        } else if (this.enQStack.top == null){
            return this.dQStack;
        } else {
            throw new Exception("Error: both stacks holds nodes");
        }
    }

    public void switchStack(Stack<T> stackHoldingNodes){
        Stack <T> otherStack;
        if (stackHoldingNodes == this.dQStack){
            otherStack = this.enQStack;
        } else {
            otherStack = this.dQStack;
        }

        while (stackHoldingNodes.peek() != null){
            otherStack.push(stackHoldingNodes.pop());
        }
        return;
    }

    @Override
    public String toString() {
        return "dQStack's top: " + this.dQStack.peek() + ", enQStack's top: " + this.enQStack.peek();
    }
}
