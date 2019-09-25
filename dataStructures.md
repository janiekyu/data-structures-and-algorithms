# Data Structures

## Array

### Declare an Array
```
String[] aArray = new String[5];
String[] bArray = {"a","b","c", "d", "e"};
String[] cArray = new String[]{"a","b","c","d","e"};
```

### Methods: 

- ```Arrays.toString(array);``` 
- ```array.length;```

### Create an ArrayList from an Array
```
String[] stringArray = { "a", "b", "c", "d", "e" };
ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
```

## Matrix - array of arrays
### Traversing through a matirx
```
int [][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};

for (int r=0; r<matrix.length; r++){    // loop through each row
	for (int c=0; c<matrix[r].length; c++){    // loop through each element in the row
		System.out.println(matrix[r][c]);
	}
} 
```

## ArrayList
### Creating arraylist 
``` 
ArrayList<String> list=new ArrayList<String>();   
    //Adding object in arraylist   
    list.add(“Hello”);      
    list.add(“Jane”);  
    list.add(“Hur”);  
```
### Methods: 
- ```.add(element)```
- ```.add(index, element)```
- ```.contains()``` - returns boolean if the list contains the specified element
- ```.remove(index)``` - removes the element at the specified index
- ```.remove(object)``` - removes the first occurrence of the element, if present
- ```.get(index)``` - returns the element at the specified index
- ```.sublist(indexBegin, indexEnd)``` - returns a list with the elements from indexBegin, inclusive, to indexEnd, exclusive
- ```.set``` (index, element) - replaced the element at the specified index
- ```.size()``` - returns the number of elements in the list
- ```.isEmpty()``` - returns true if list contains no elements


## String

### Declare a String
 ```
 String str1 = "Welcome";   // String literal
 String str1 = new String("Welcome");   // Using new keyworde
 ```

 ### Methods

- ```.charAt(index)``` - returns the character at the specified index
- ```.equals(string)``` - compares the content of the strings and returns a boolean
- ```.equalsIgnoreCase(string)``` - returns boolean comparing the content of the strings ignoring case
- ```.toUpperCase()``` - returns a string with all the characters changed to uppercase
- ```.toLowerCase()``` - returns a string with all the characters changed to lowercase
- ```.split(regex)``` - It splits the string and returns the array of substrings that matches the given regular expression
- ```.toCharArray()``` - Converts the string to a character array
- ```.length()``` - It returns the length of a String

### Converting char array to string

```
char [] charArray =  {"a","b","c", "d", "e"};
String stringFromArray = new String(charArray);
// stringFromArray = "abcde"
```
## Hash Map

### Methods
- ```.containsKey(key)``` - returns boolean
- ```.containsValue(value)``` - returns boolean
- ```.get(key)``` - returns the value for the key, null if the key is not found
- ```.isEmpty()``` - returns true if the map has no key-value pairs
- ```.put(key, value)``` - adds a k/v pair to the hash map
- ```.remove(key)``` - removes the mapping for the specified key, if present
- ```.size()``` - returns the number of key-value mappings
- ```.entrySet()``` - returns a set view the mappings ([B=3, C=1, D=0])
- ```.keySet()``` - returns a set view of the keys
- ```.values()``` - returns a collection of the values

## Trees

Resources: [CF Reading](https://codefellows.github.io/common_curriculum/data_structures_and_algorithms/Code_401/class-15/resources/Trees.html)

### Depth first traversal:preorder, inorder, postorder

The most common way to traverse through a tree is to use recursion. With these traversals, we rely on the call stack to navigate back up the tree when we have reached the end.

``` 
ALGORITHM PreOrder(node)
// INPUT <-- root Node
// OUTPUT <-- preorder output of tree nodes

    OUTPUT <-- node.Value

    if node.LeftChild is not Null
        PreOrder(node.LeftChild)

    if node.RightChild is not NULL
        PreOrder(node.RightChild)
```

### Breadth First
The breadth first traversal iterates through the tree by going through each level of the tree node by node.
```
ALGORITHM BreadthFirst(root)
//INPUT <-- root node
// OUTPUT <-- front node of queue to console

    Queue breadth <-- new Queue()
	breadth.Enqueue(root)
		
	while breadth.Peek
	    Node front = breadth.Dequeue()
		OUTPUT <-- front.Value

		if front.LeftChild is not null
			breadth.Enqueue(front.LeftChild)

		if front.RightChild is not NULL
			breadth.Enqueue(front.RightChild)
```

### Binary Search Trees

The best way to approach a BST search is with a while loop. The condition within this while loop would be to keep running until it hits a leaf.

The Big O of a Binary Search Tree’s insertion and search operations is O(h), or O(height). In the worst case, we will have to search all the way down to a leaf, which will require searching through as many nodes as the tree is tall.

## Stacks
Resources: [CF Reading](https://codefellows.github.io/common_curriculum/data_structures_and_algorithms/Code_401/class-10/resources/stacks_and_queues.html)

The Stack class represents a last-in-first-out (LIFO) stack of objects.

### Create a stack

```Stack stack = new Stack();```

### Methods
- ```.empty()``` - returns boolean
- ```.peek()``` - Returns the object at the object at the top of this stack without removing it.
- ```.pop()``` - Removes the object at the top of this stack and returns that object as the value of this function.
- ```.push(item)``` - Pushes an item onto the top of this stack.
- ```.search(Object)``` - Returns the distance from the top of the stack of the occurrence nearest the top of the stack; the topmost item on the stack is considered to be at distance 1. The return value -1 indicates that the object is not on the stack.


## Graphs

Resources: [CF Reading](https://codefellows.github.io/common_curriculum/data_structures_and_algorithms/Code_401/class-35/resources/graphs.html)
