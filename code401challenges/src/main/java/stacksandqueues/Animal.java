package stacksandqueues;

public class Animal <T> extends Node {

    // instance variable to add
    String type;

    // constructor
    public Animal (T value) {
        super(value);
        this.type = null;
    }
}
