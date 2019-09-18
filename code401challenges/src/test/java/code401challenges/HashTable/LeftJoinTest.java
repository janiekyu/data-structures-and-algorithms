package code401challenges.HashTable;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LeftJoinTest {
    @Test
    public void testLeftJoin() {
        HashTable ht1 = new HashTable(100);
        ht1.set("fond", "enamored");
        ht1.set("wrath", "anger");
        ht1.set("diligent", "employed");
        ht1.set("outfit", "garb");
        ht1.set("guide", "usher");

        HashTable ht2 = new HashTable(100);
        ht2.set("fond", "averse");
        ht2.set("wrath", "delight");
        ht2.set("diligent", "idle");
        ht2.set("guide", "follow");
        ht2.set("flow", "jam");

        System.out.println(LeftJoin.leftJoin(ht1, ht2));

        //System.out.println(ht1.get("fond"));

        //LeftJoin.printHashTable(LeftJoin.leftJoin(ht1, ht2));
    }
}