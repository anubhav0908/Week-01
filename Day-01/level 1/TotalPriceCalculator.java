import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args) {
        // Create a scanner object to get input from the user
        Scanner input = new Scanner(System.in);
        
        // Input the unit price and quantity
        System.out.print("Enter the unit price of the item (in INR): ");
        double unitPrice = input.nextDouble();
        
        System.out.print("Enter the quantity of the item: ");
        int quantity = input.nextInt();
        
        // Calculate the total price
        double totalPrice = unitPrice * quantity;
        
        // Output the result
        System.out.printf("The total purchase price is INR" + totalPrice +" if the quantity"+ quantity + "and unit price is INR"+ unitPrice);
        
        // Close the scanner
        input.close();
    }
}
