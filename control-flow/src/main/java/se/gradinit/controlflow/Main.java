package se.gradinit.controlflow;

public class Main {
    public static void main(String[] args) {
        // 1. If-Else example
        int temperature = 25;
        System.out.println("--- If-Else Example ---");
        if (temperature > 30) {
            System.out.println("It's hot outside.");
        } else if (temperature >= 20) {
            System.out.println("The weather is pleasant.");
        } else {
            System.out.println("It's a bit chilly.");
        }

        // 2. Ternary Operator example
        System.out.println("\n--- Ternary Operator Example ---");
        boolean isRaining = true;
        String action = isRaining ? "Take an umbrella" : "Go for a walk";
        System.out.println("Status: Raining is " + isRaining);
        System.out.println("Action: " + action);

        // 3. Switch statement example
        System.out.println("\n--- Switch Case Example ---");
        int month = 5;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Unknown";
                break;
        }
        System.out.println("Month: " + month);
        System.out.println("Season: " + season);
    }
}
