import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Get the number input from the user
        System.out.print("Enter a number to display its multiplication table: ");
        int number = input.nextInt();

        // Define an array to store multiplication results from 1 to 10
        int[] multiplicationTable = new int[10];

        // Loop from 1 to 10 and store the multiplication results in the array
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }

        // Display the multiplication table using the array
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }

        // Close the scanner to avoid memory leak
        input.close();
    }
}
