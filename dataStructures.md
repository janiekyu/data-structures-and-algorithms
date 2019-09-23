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
- ```toCharArray()``` - Converts the string to a character array
- ```length()``` - It returns the length of a String

### Converting char array to string

```
char [] charArray =  {"a","b","c", "d", "e"};
String stringFromArray = new String(charArray);
// stringFromArray = "abcde"
```
