# Control Flow in Java

This module explains the control flow statements in Java, which allow you to control the order in which code is executed.

## Decision Making Statements

### 1. `if`, `else if`, and `else`
The `if` statement is the most basic control flow statement. It executes a block of code only if a specified boolean condition is true.

```java
int score = 85;

if (score >= 90) {
    System.out.println("Excellent!");
} else if (score >= 70) {
    System.out.println("Good job!");
} else {
    System.out.println("Keep trying!");
}
```

### 2. Ternary Operator (`? :`)
The ternary operator is a shorthand for the `if-else` statement. It's the only operator that takes three operands.

**Syntax:** `condition ? expressionIfTrue : expressionIfFalse;`

```java
int age = 20;
String status = (age >= 18) ? "Adult" : "Minor";
```

### 3. `switch` Statement
The `switch` statement allows a variable to be tested for equality against a list of values. Each value is called a `case`.

```java
int day = 3;
String dayName;

switch (day) {
    case 1:
        dayName = "Monday";
        break;
    case 2:
        dayName = "Tuesday";
        break;
    case 3:
        dayName = "Wednesday";
        break;
    default:
        dayName = "Invalid day";
        break;
}
```
*Note: The `break` statement is crucial to prevent "fall-through" to the next case.*

## Examples
See `Main.java` in the source code for a complete example of these statements in action.
