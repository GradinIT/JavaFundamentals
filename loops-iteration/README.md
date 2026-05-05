# Loops and Iteration in Java

This module explains how to repeat code execution using loops and how to iterate over collections in Java.

## Loops

### 1. `for` Loop
The `for` loop is used when you know how many times you want to execute a block of code.

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Iteration: " + i);
}
```

### 2. `while` Loop
The `while` loop repeats a block of code as long as a specified condition is true.

```java
int i = 0;
while (i < 5) {
    System.out.println("Count: " + i);
    i++;
}
```

### 3. `do-while` Loop
The `do-while` loop is similar to the `while` loop, but it executes the code block once before checking the condition.

```java
int i = 0;
do {
    System.out.println("Number: " + i);
    i++;
} while (i < 5);
```

## Iteration over Collections

### 4. `for-each` Loop (Enhanced for Loop)
The `for-each` loop is used to iterate through elements of an array or a collection. It's more readable and less error-prone than a standard `for` loop when you don't need the index.

```java
String[] fruits = {"Apple", "Banana", "Cherry"};
for (String fruit : fruits) {
    System.out.println(fruit);
}
```

### 5. `Iterator`
An `Iterator` is an object that can be used to loop through collections, like `ArrayList`. It provides a way to remove elements while iterating safely.

```java
List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
Iterator<String> it = list.iterator();
while (it.hasNext()) {
    String value = it.next();
    System.out.println(value);
}
```

## Examples
See `Main.java` in the source code for a complete example of these loops and iteration methods in action.
