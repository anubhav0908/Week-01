import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote based on their age
    public boolean canStudentVote(int age) {
        // Validate age (negative age is invalid)
        if (age < 0) {
            return false;  // Invalid age, cannot vote
        }
        // Check if age is 18 or above
        return age >= 18;  // True if age is 18 or above, else false
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        // Create an array to store the ages of 10 students
        int[] ages = new int[10];

        // Loop through the array to take user input for the ages
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }

        // Check whether each student can vote
        for (int i = 0; i < ages.length; i++) {
            boolean canVote = checker.canStudentVote(ages[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") cannot vote.");
            }
        }

        input.close(); // Close the scanner
    }
}
