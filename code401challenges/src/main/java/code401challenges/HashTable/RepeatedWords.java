package code401challenges.HashTable;

//https://stackoverflow.com/questions/6105787/how-to-find-duplicate-and-unique-string-entries-using-hashtable
//https://stackoverflow.com/questions/7384791/splitting-strings-through-regular-expressions-by-punctuation-and-whitespace-etc

import java.util.Arrays;

public class RepeatedWords {
    public static String splitBook(String book){
        String[] splitBookArray= book.split("[\\p{Punct}\\s]+");
        HashTable wordHashTable = new HashTable(1024);
        System.out.println(Arrays.toString(splitBookArray));
        //return "hello";

        for (String word: splitBookArray){
            if (wordHashTable.contains(word.toUpperCase())==false){
                wordHashTable.set(word.toUpperCase(), "hello");
            } else {
                System.out.println("First repeated word: " + word);
                return word;
            }

        }
        System.out.println("No repeated words");
        return "No repeated words";
    }
}
