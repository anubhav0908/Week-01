import java.util.Scanner;

public class VotingEligibility {

    // Method to get ages of students from user
    public static int[] getStudentAges(int numStudents) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[numStudents];

        // Get age input from user
        System.out.println("Enter the ages of " + numStudents + " students:");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        return ages;
    }

    // Method to check if each student can vote
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] eligibility = new String[ages.length][2];  // 2D array for age and eligibility

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                eligibility[i][0] = String.valueOf(ages[i]);
                eligibility[i][1] = "Invalid age, cannot vote";
            } else if (ages[i] >= 18) {
                eligibility[i][0] = String.valueOf(ages[i]);
                eligibility[i][1] = "Can Vote";
            } else {
                eligibility[i][0] = String.valueOf(ages[i]);
                eligibility[i][1] = "Cannot Vote";
            }
        }

        return eligibility;
    }

    // Method to display the eligibility results
    public static void displayEligibilityTable(String[][] eligibility) {
        System.out.println("\nAge\tEligibility");
        for (int i = 0; i < eligibility.length; i++) {
            System.out.println(eligibility[i][0] + "\t" + eligibility[i][1]);
        }
    }

    public static void main(String[] args) {
        final int NUM_STUDENTS = 10;

        // Get student ages
        int[] studentAges = getStudentAges(NUM_STUDENTS);

        // Check voting eligibility
        String[][] votingEligibility = checkVotingEligibility(studentAges);

        // Display eligibility in table format
        displayEligibilityTable(votingEligibility);
    }
}
