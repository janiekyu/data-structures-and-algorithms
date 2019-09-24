package code401challenges.Graph;

    public class QueueNode <T> {

        // instance variables
        T value;
        QueueNode <T> nextNode;

        // constructor

        public QueueNode (T value) {
            this.value = value;
            this.nextNode = null;
        }

        @Override
        public String toString() {
            return this.value.toString();
        }
    }