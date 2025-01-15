import java.util.Random;

public class StudentScorecard {

    // Method to generate random scores for PCM
    public static int[][] generateScores(int students) {
        Random rand = new Random();
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(100); // Random scores between 0 and 99
            }
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateTotalAveragePercentage(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to calculate grades
    public static String[] calculateGrades(double[][] percentageData) {
        String[] grades = new String[percentageData.length];
        for (int i = 0; i < percentageData.length; i++) {
            double percentage = percentageData[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("Student Physics Chemistry Math Total Average Percentage Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("S" + (i + 1));
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] +" ");
            }
            System.out.print((int) results[i][0] + " " + results[i][1] + " " + results[i][2] + " " + grades[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int students = 10; // Number of students

        // Generate scores
        int[][] scores = generateScores(students);

        // Calculate total, average, and percentage
        double[][] results = calculateTotalAveragePercentage(scores);

        // Calculate grades
        String[] grades = calculateGrades(results);

        // Display the scorecard
        displayScorecard(scores, results, grades);
    }
}