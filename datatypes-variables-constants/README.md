# Data Types, Variables, and Constants in Java

This module covers the fundamental building blocks of Java programming.

## Data Types

Java is a strongly typed language, meaning every variable must have a declared type. Data types in Java are divided into two categories:

### 1. Primitive Data Types
There are 8 primitive data types in Java:
- **byte**: 8-bit signed integer.
- **short**: 16-bit signed integer.
- **int**: 32-bit signed integer (most commonly used for whole numbers).
- **long**: 64-bit signed integer.
- **float**: Single-precision 32-bit IEEE 754 floating point.
- **double**: Double-precision 64-bit IEEE 754 floating point (default for decimals).
- **boolean**: Represents one bit of information: `true` or `false`.
- **char**: A single 16-bit Unicode character.

### 2. Reference Data Types
Reference types are created by the programmer and are not predefined by Java (except for `String`). Examples include:
- Classes
- Interfaces
- Arrays
- `String` (a special class in Java)

## Variables

A variable is a container that holds data during the execution of a Java program.

### Variable Declaration and Initialization
```java
int myNumber; // Declaration
myNumber = 10; // Initialization

int anotherNumber = 20; // Declaration and Initialization in one line
```

### Types of Variables
- **Local Variables**: Declared inside a method, constructor, or block.
- **Instance Variables**: Declared in a class but outside a method.
- **Static Variables**: Declared with the `static` keyword; shared among all instances of a class.

## Constants

Constants are variables whose values cannot be changed once assigned. In Java, we use the `final` keyword to declare a constant.

### Constant Declaration
By convention, constant names are written in uppercase with underscores separating words.

```java
final double PI = 3.14159;
final int MAX_USERS = 100;
```
