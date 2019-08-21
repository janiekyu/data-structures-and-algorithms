package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {
    @Test public void testEverything(){

        AnimalShelter<String> shelter = new AnimalShelter<>();
        Animal dog1 = new Dog("dog1");
        Animal dog2 = new Dog("dog2");
        Animal cat1 = new Cat("cat1");
        Animal cat2 = new Cat("cat2");
        Animal cat3 = new Cat("cat3");

        shelter.enqueue(cat1);
        shelter.enqueue(cat2);
        shelter.enqueue(cat3);
        shelter.enqueue(dog1);
        shelter.enqueue(dog2);

        assertEquals("dog1 dog2", shelter.dogQueue.walkTheQueue());
        assertEquals("cat1 cat2 cat3", shelter.catQueue.walkTheQueue());

        shelter.dequeue("dog");
        assertEquals("dog2", shelter.dogQueue.walkTheQueue());

        shelter.dequeue("cat");
        shelter.dequeue("cat");
        assertEquals("cat3", shelter.catQueue.walkTheQueue());
    }

    @Test (expected = Exception.class)
    public void testDequeueEmtpyShelter(){
        AnimalShelter<String> shelter = new AnimalShelter<>();
        shelter.dequeue("cat");
    }

    @Test public void testNoPref(){
        AnimalShelter<String> shelter = new AnimalShelter<>();
        assertNull(shelter.dequeue("snake"));
    }

}