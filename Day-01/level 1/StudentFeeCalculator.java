import java.util.Scanner;

public class StudentFeeCalculator {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for fee and discount percentage
        System.out.print("Enter the fee amount: ");
        double fee = input.nextDouble();  // User inputs the fee
        
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();  // User inputs the discount percentage

        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100;

        // Calculate the final fee after applying the discount
        double finalFee = fee - discount;

        // Output the result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);

        // Close the scanner object to avoid memory leaks
        input.close();
    }
}
