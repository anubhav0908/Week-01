import java.util.Scanner;

public class TotalIncomeCalculator {

    public static void main(String[] args) {

        // Declare variables for salary, bonus, and total income
        double salary = 0.0, bonus = 0.0, totalIncome = 0.0;

        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // User input for salary
        System.out.print("Enter salary (in INR): ");
        salary = input.nextDouble();  // Read salary value

        // User input for bonus
        System.out.print("Enter bonus (in INR): ");
        bonus = input.nextDouble();  // Read bonus value

        // Calculate total income by adding salary and bonus
        totalIncome = salary + bonus;

        // Output the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + 
                           ". Hence, Total Income is INR " + totalIncome);

        // Close the scanner to prevent resource leak
        input.close();
    }
}
