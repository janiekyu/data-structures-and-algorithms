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


        assertEquals("[[outfit, garb, null], [wrath, anger, delight], [diligent, employed, idle], [guide, usher, follow], [fond, enamored, averse]]", LeftJoin.leftJoin(ht1, ht2).toString());

    }
        @Test
        public void testLeftJoin2() {
            HashTable ht1 = new HashTable(100);
            ht1.set("fond", "enamored");
            ht1.set("wrath", "anger");
            ht1.set("diligent", "employed");
            ht1.set("outfit", "garb");
            ht1.set("guide", "usher");

            HashTable ht2 = new HashTable(100);
            ht2.set("fond", "averse");
            ht2.set("fond", "hate");

            assertEquals("[[outfit, garb, null], [wrath, anger, null], [diligent, employed, null], [guide, usher, null], [fond, enamored, hate, averse]]", LeftJoin.leftJoin(ht1, ht2).toString());

    }


    @Test
    public void testLeftJoin3() {
        HashTable ht1 = new HashTable(100);

        HashTable ht2 = new HashTable(100);
        ht2.set("fond", "averse");
        ht2.set("fond", "hate");

        assertEquals("[]", LeftJoin.leftJoin(ht1, ht2).toString());

    }
}