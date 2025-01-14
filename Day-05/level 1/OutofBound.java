import java.util.Scanner;
public class OutofBound {
    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String str) {
        System.out.println("Attempting to access an index beyond the length of the string...");
        // This will throw StringIndexOutOfBoundsException
        System.out.println(str.charAt(str.length()));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String str) {
        try {
            System.out.println("Attempting to access an index beyond the length of the string with exception handling...");
            System.out.println(str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get user input for the string
        System.out.print("Enter the string");
        String text = sc.next();
        // Call method to generate the exception
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
        // Call method to handle the exception
        handleException(text);
    }
}