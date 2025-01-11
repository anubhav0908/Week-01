public class AverageMarkCalculator {
    public static void main(String[] args) {
        // Define the marks in each subject
        int mathsMark = 94;
        int physicsMark = 95;
        int chemistryMark = 96;

        // Calculate the average mark
        int totalMarks = mathsMark + physicsMark + chemistryMark;
        double averageMark = totalMarks / 3.0;

        // Output the result
        System.out.println("Sam's average mark in PCM is " + averageMark);
    }
}
