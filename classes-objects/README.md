# Classes and Objects in Java

This module explains the concept of Classes and Objects, which are the fundamental building blocks of Object-Oriented Programming (OOP) in Java.

## What is a Class?

A **Class** is a blueprint or a template for creating objects. It defines the state (attributes) and behavior (methods) that objects of that class will have.

Think of a class as a technical drawing for a car. It specifies that a car has a color, a model, and a top speed, but it isn't a car itself.

### Key Components of a Class:
1.  **Fields (Attributes)**: Variables that represent the state of an object.
2.  **Methods**: Functions that represent the behavior of an object.
3.  **Constructors**: Special methods used to initialize objects.

## What is an Object?

An **Object** is an instance of a class. When a class is defined, no memory is allocated until an object of that class is created.

If the class is the "Car" blueprint, then "My Red Tesla" is an object created from that blueprint.

## Example Class: `Car`

```java
public class Car {
    // Fields (Attributes)
    String brand;
    String model;
    int year;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method (Behavior)
    public void drive() {
        System.out.println(brand + " " + model + " is driving!");
    }
}
```

## Creating and Using an Object

To create an object in Java, we use the `new` keyword:

```java
Car myCar = new Car("Toyota", "Corolla", 2022);
myCar.drive(); // Outputs: Toyota Corolla is driving!
```
