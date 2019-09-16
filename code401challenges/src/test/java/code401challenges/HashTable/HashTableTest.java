package code401challenges.HashTable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {

    @Test
    public void testSet() {
        HashTable ht = new HashTable(10);
        ht.set("Caleb", "son");
        ht.set("Chung", "grandfather");
        ht.set("Jane", "mom");
        ht.set("Sam", "dad");
        ht.set("Ethan", "son");
        ht.set("Kay", "grandmother");

        assertEquals("son", ht.get("Caleb"));
        assertEquals("grandfather", ht.get("Chung"));

        assertTrue(ht.contains("Ethan"));
        assertFalse(ht.contains("Elmo"));
    }

    @Test
    public void get() {

    }
}