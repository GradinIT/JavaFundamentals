package se.gradinit.datatypes;

public class Main {

    // Instance Variable
    private String message = "Hello from Instance Variable";

    // Static Variable (Constant when combined with final)
    private static final double GRAVITY = 9.81;

    public static void main(String[] args) {
        // --- PRIMITIVE DATA TYPES ---
        
        // Integer types
        byte smallNumber = 127;
        short mediumNumber = 32000;
        int standardNumber = 2000000000;
        long largeNumber = 9000000000000000000L; // Note the 'L' suffix

        // Floating-point types
        float piFloat = 3.14f; // Note the 'f' suffix
        double piDouble = 3.14159265359;

        // Character type
        char grade = 'A';

        // Boolean type
        boolean isJavaFun = true;

        // --- REFERENCE DATA TYPES ---
        String text = "Java is powerful!";
        int[] numbers = {1, 2, 3, 4, 5};

        // --- VARIABLES ---
        int score = 100; // Local variable
        score = 150;     // Value can be changed

        // --- CONSTANTS ---
        final int MAX_SCORE = 500;
        // MAX_SCORE = 600; // This would cause a compilation error

        // Printing values
        System.out.println("Primitive Types:");
        System.out.println("int: " + standardNumber);
        System.out.println("long: " + largeNumber);
        System.out.println("double: " + piDouble);
        System.out.println("boolean: " + isJavaFun);
        System.out.println("char: " + grade);

        System.out.println("\nReference Types:");
        System.out.println("String: " + text);

        System.out.println("\nVariables and Constants:");
        System.out.println("Variable score: " + score);
        System.out.println("Constant MAX_SCORE: " + MAX_SCORE);
        System.out.println("Static Constant GRAVITY: " + GRAVITY);

        // Instance variable requires an instance (an object of a type defined as in a class) to be created
        Main mainInstance = new Main();
        System.out.println("Instance Variable: " + mainInstance.message);
    }
}
