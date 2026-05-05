package se.gradinit.classes;

/**
 * A class representing a Car.
 * This class serves as a blueprint for Car objects.
 */
public class Car {
    // Attributes (State)
    private String brand;
    private String model;
    private int year;

    /**
     * Constructor to initialize a Car object.
     * @param brand The brand of the car
     * @param model The model of the car
     * @param year The manufacturing year
     */
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    /**
     * A method representing the behavior of the car.
     */
    public void drive() {
        System.out.println("The " + year + " " + brand + " " + model + " is now driving.");
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
