# Hashmap LEFT JOIN
[Code](https://github.com/janiekyu/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/HashTable/LeftJoin.java)

## Challenge
Write a function that LEFT JOINs two hashmaps into a single data structure. LEFT JOIN means all the values in the first hashmap are returned, and if values exist in the “right” hashmap, they are appended to the result row. If no values exist in the right hashmap, then some flavor of NULL should be appended to the result row.

## Approach & Efficiency
- Iterate over the left hash table
- For each key/value pair, add the key and value to an array list
- Check if the key exists in the right hash table
- if it exists, append the value to array list
- if not, append 'null'

## Solution
![image](https://github.com/janiekyu/data-structures-and-algorithms/blob/master/assets/cc33-image.JPG)
