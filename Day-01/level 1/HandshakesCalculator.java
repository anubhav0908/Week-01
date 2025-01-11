import java.util.Scanner;

public class HandshakesCalculator {
    public static void main(String[] args) {
        // Create a scanner object to get input from the user
        Scanner input = new Scanner(System.in);
        
        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        
        // Calculate the maximum number of handshakes using the combination formula
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        // Output the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + handshakes);
        
        // Close the scanner
       input.close();
    }
}
