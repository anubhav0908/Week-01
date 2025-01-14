import java.util.Scanner;
public class ArgumentException{
    // Method to generate IllegalArgumentException
    public static void generateIllegalArgumentexception(String str) {
        System.out.println("Attempting to create a substring with an invalid range...");
        // This will throw IllegalArgumentException
        System.out.println(str.substring(5, 3));
    }

    // Method to handle IllegalArgumentException
    public static void handleIllegalArgumentexception(String str) {
        try {
            System.out.println("Attempting to create a substring with exception handling...");
            System.out.println(str.substring(5, 3));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input for the string
        System.out.print("Enter the string");
        String text = sc.next();

        // Call method to generate IllegalArgumentException
        try {
            generateIllegalArgumentexception(text);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        // Call method to handle IllegalArgumentException
        handleIllegalArgumentexception(text);

  
    }
}