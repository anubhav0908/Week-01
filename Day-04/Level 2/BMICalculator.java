import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI for each person and populate the array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0]; // Weight in kg
            double heightInCm = data[i][1]; // Height in cm
            double heightInMeters = heightInCm / 100; // Convert height to meters
            double bmi = weight / (heightInMeters * heightInMeters); // BMI formula
            data[i][2] = bmi; // Store BMI in the third column
        }
    }

    // Method to determine BMI status for each person based on the updated categories
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2]; // BMI value
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25.0 && bmi < 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }
        
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3]; // 10 rows (people), 3 columns (weight, height, BMI)
        String[] status = new String[10]; // To store BMI status
        
        // Taking input for weight (kg) and height (cm)
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            
            System.out.print("Enter weight (in kg): ");
            data[i][0] = scanner.nextDouble(); // Weight
            
            System.out.print("Enter height (in cm): ");
            data[i][1] = scanner.nextDouble(); // Height
        }

        // Calculate BMI for each person
        calculateBMI(data);

        // Determine BMI status for each person
        status = determineBMIStatus(data);

        // Display the results
        System.out.println("\nBMI Details of 10 People:");
        System.out.println("Person | Weight (kg) | Height (cm) | BMI    | Status");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%6d | %12.2f | %12.2f | %6.2f | %s%n",
                    (i + 1), data[i][0], data[i][1], data[i][2], status[i]);
        }

        scanner.close(); // Close the scanner 
    }
}
