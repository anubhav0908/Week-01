import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {

        // Declare variables for Principal, Rate, and Time
        double principal, rate, time, simpleInterest;

        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // User input for Principal
        System.out.print("Enter the Principal amount: ");
        principal = input.nextDouble();

        // User input for Rate of Interest
        System.out.print("Enter the Rate of Interest: ");
        rate = input.nextDouble();

        // User input for Time
        System.out.print("Enter the Time period (in years): ");
        time = input.nextDouble();

        // Calculate the Simple Interest using the formula
        simpleInterest = (principal * rate * time) / 100;

        // Output the result
        System.out.println("The Simple Interest is " + simpleInterest + 
                           " for Principal " + principal + 
                           ", Rate of Interest " + rate + 
                           " and Time " + time);

        // Close the scanner 
        input.close();
    }
}
