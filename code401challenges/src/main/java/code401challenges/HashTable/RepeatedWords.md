# Code Challenge 31 - Repeated Words

[CODE](https://github.com/janiekyu/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/HashTable/RepeatedWords.java) | [TESTS](https://github.com/janiekyu/data-structures-and-algorithms/blob/master/code401challenges/src/test/java/code401challenges/HashTable/RepeatedWordsTest.java)
- Write a function that accepts a lengthy string parameter.
- Without utilizing any of the built-in library methods available to your language, return the first word to occur more than once in that provided string.

## Algorithm
- Use the .split() method to put each word in the string parameter into an array
- Create a hash table to hold unique words
- Iterate over the array of words
  - Use the .contains() method to see if the current word is already in the hash table
  - If it's not in the hash table, add it
  - If it is, then return the word

## Resources
- https://stackoverflow.com/questions/6105787/how-to-find-duplicate-and-unique-string-entries-using-hashtable
- https://stackoverflow.com/questions/7384791/splitting-strings-through-regular-expressions-by-punctuation-and-whitespace-etc
