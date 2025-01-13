import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateRandomScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // 2D array to store scores for each student

        // Generate random scores between 50 and 99 (2-digit numbers)
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 50 + rand.nextInt(50); // Physics score
            scores[i][1] = 50 + rand.nextInt(50); // Chemistry score
            scores[i][2] = 50 + rand.nextInt(50); // Math score
        }

        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateScores(int[][] scores) {
        double[][] results = new double[scores.length][4]; // 2D array to store total, average, and percentage

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2]; // Total score
            double average = total / 3.0; // Average score
            double percentage = (total / 300.0) * 100; // Percentage score

            // Store total, average, and percentage
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round off average to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round off percentage to 2 decimal places
        }

        return results;
    }

    // Method to display the scorecard for all students in tabular format
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("----------------------------------------------------------");
        System.out.println("Student No.\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("----------------------------------------------------------");

        // Display the scorecard
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%11d\t%d\t\t%d\t\t%d\t%d\t%.2f\t%.2f%%\n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2], 
                    (int) results[i][0], results[i][1], results[i][2]);
        }

        System.out.println("----------------------------------------------------------");
    }

    public static void main(String[] args) {
        // Take input for the number of students
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Generate random scores for the students
        int[][] scores = generateRandomScores(numStudents);

        // Calculate total, average, and percentage for each student
        double[][] results = calculateScores(scores);

        // Display the scorecard in a tabular format
        displayScorecard(scores, results);

        input.close();
    }
}
