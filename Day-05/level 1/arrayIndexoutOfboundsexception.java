import java.util.Scanner;
public class arrayIndexoutOfboundsexception {
    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateexception(String[] names, int index) {
        // Accessing an index larger than the length of the array will throw an ArrayIndexOutOfBoundsException
        System.out.println("Accessing name at index: " + index);
        System.out.println("Name: " + names[index]);  // This will throw ArrayIndexOutOfBoundsException if index is out of bounds
    }

    // Method to handle the ArrayIndexOutOfBoundsException using try-catch
    public static void  handlearroutOfboundexception(String[] names, int index) {
        try {
            // Calling the method that might generate the exception
            generateexception(names, index);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the ArrayIndexOutOfBoundsException
            System.out.println("Error: Invalid index! The index you provided is out of bounds.");
        } catch (RuntimeException e) {
            // Handling any generic runtime exceptions
            System.out.println("Error: A runtime exception occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Array of names
        String[] names = {"Furqan", "Deepansh", "Anubhav", "Mayaank", "omprakash"};
        Scanner sc = new Scanner(System.in);
        // Asking user for the index they want to access
        System.out.print("Enter an index to access the name: ");
        int index = sc.nextInt();  // Taking input as an integer

        // Calling the method to generate the exception and handle it
        handlearroutOfboundexception(names, index);

    }
}
