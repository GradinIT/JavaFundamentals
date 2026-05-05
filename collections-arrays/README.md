# Collections and Arrays in Java

This module explains how to store and manage groups of objects using Arrays and the Java Collections Framework.

## 1. Arrays
An array is a container object that holds a fixed number of values of a single type. The length of an array is established when the array is created.

```java
int[] numbers = new int[5];
numbers[0] = 10;
int firstElement = numbers[0];

// Initialization syntax
String[] fruits = {"Apple", "Banana", "Cherry"};
```

## 2. Collections Framework
The Java Collections Framework provides a set of interfaces and classes to store and manipulate groups of data more flexibly than arrays.

### List
An ordered collection (also known as a sequence). Lists can contain duplicate elements.
- **ArrayList**: Resizable-array implementation. Fast for random access.
- **LinkedList**: Doubly-linked list implementation. Fast for insertions/deletions at the ends.

```java
List<String> list = new ArrayList<>();
list.add("Java");
list.add("Kotlin");
```

### Set
A collection that contains no duplicate elements.
- **HashSet**: Backed by a hash table. No guaranteed iteration order.
- **TreeSet**: Backed by a TreeMap. Elements are sorted.

```java
Set<Integer> set = new HashSet<>();
set.add(1);
set.add(1); // Duplicate, will not be added
```

### Map
An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value.
- **HashMap**: No guaranteed order.
- **TreeMap**: Ordered by keys.

```java
Map<String, Integer> scores = new HashMap<>();
scores.put("Alice", 90);
scores.put("Bob", 85);
```

## Examples
See `Main.java` in the source code for a complete example of these structures in action.
