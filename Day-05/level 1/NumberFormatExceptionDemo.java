import java.util.Scanner;
public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateexception(String text) {
        // This line will throw a NumberFormatException if 'text' is not a valid integer
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);  // This will not be executed if an exception occurs
    }

    // Method to handle the NumberFormatException using try-catch
    public static void handlenumberformatexception(String text) {
        try {
            // Attempting to generate the exception by calling the method
            generateexception(text);
        } catch (NumberFormatException e) {
            // Catching and handling the NumberFormatException
            System.out.println("Error: Invalid number format! Please enter a valid integer.");
        } catch (RuntimeException e) {
            // Catching and handling any generic runtime exceptions
            System.out.println("Error: A runtime exception occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Asking user for input
        System.out.print("Enter a number: ");
        String userInput = sc.nextLine();  
        
        // Calling the method to demonstrate the exception and handle it
        handlenumberformatexception(userInput);
    }
}