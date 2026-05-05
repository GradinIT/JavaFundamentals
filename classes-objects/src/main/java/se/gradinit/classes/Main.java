package se.gradinit.classes;

public class Main {
    public static void main(String[] args) {
        // Creating an object (instance) of the Car class
        Car myCar = new Car("Volvo", "XC60", 2024);

        // Accessing methods of the object
        System.out.println("Brand: " + myCar.getBrand());
        myCar.drive();

        // Creating another object of the same class
        Car anotherCar = new Car("Tesla", "Model 3", 2023);
        anotherCar.drive();
    }
}
