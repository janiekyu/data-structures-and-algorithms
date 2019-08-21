package stacksandqueues;

public class AnimalShelter<T> {

    // Instance variables
    Queue<T> dogQueue;
    Queue<T> catQueue;

    // Constructor
    public AnimalShelter (){
        dogQueue = new <T> Queue();
        catQueue= new <T> Queue();
    }

    public void enqueue(Animal<T> animalToAdd){
        if (animalToAdd.type.equals("dog")){
            dogQueue.enqueue(animalToAdd);
        } else if (animalToAdd.type.equals("cat")){
            catQueue.enqueue(animalToAdd);
        }
    }

    public T dequeue(String pref){
        if (pref.equals("dog")){
            return dogQueue.dequeue();
        } else if (pref.equals("cat")){
            return catQueue.dequeue();
        } else return null;
    }
}


