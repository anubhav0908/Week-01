import java.util.Scanner;

public class TemperatureCalculator {

    // method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Function to take input
    public static double getInput(String type) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in " + type + ": ");
        return scanner.nextDouble();
    }

    // Function to display the results
    public static void displayResult(double inputTemp, double convertedTemp, String inputUnit, String outputUnit) {
        System.out.println(inputTemp + " " + inputUnit + " is equal to " + convertedTemp + " " + outputUnit + ".");
    }

    // Main function
    public static void main(String[] args) {
        // Choose the conversion type
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the conversion type:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter 1 or 2: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            // Convert Fahrenheit to Celsius
            double fahrenheit = getInput("Fahrenheit");
            double celsius = fahrenheitToCelsius(fahrenheit);
            displayResult(fahrenheit, celsius, "Fahrenheit", "Celsius");
        } else if (choice == 2) {
            // Convert Celsius to Fahrenheit
            double celsius = getInput("Celsius");
            double fahrenheit = celsiusToFahrenheit(celsius);
            displayResult(celsius, fahrenheit, "Celsius", "Fahrenheit");
        } else {
            System.out.println("Invalid choice! Please enter 1 or 2.");
        }
    }
}
