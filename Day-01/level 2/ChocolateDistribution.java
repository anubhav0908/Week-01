import java.util.Scanner;

public class ChocolateDistribution {

    public static void main(String[] args) {

        // Declare variables for number of chocolates and number of children
        int numberOfChocolates, numberOfChildren;
        int chocolatesPerChild, remainingChocolates;

        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // User input for number of chocolates
        System.out.print("Enter the number of chocolates: ");
        numberOfChocolates = input.nextInt();

        // User input for number of children
        System.out.print("Enter the number of children: ");
        numberOfChildren = input.nextInt();

        // Calculate how many chocolates each child gets and remaining chocolates
        if (numberOfChildren != 0) {
            chocolatesPerChild = numberOfChocolates / numberOfChildren; // Integer division
            remainingChocolates = numberOfChocolates % numberOfChildren; // Remainder
        } else {
            chocolatesPerChild = 0;
            remainingChocolates = numberOfChocolates; // All chocolates remain if there are no children
        }

        // Output the result
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + 
                           " and the number of remaining chocolates are " + remainingChocolates);

        // Close the scanner 
        input.close();
    }
}
