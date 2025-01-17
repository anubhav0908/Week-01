import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    // Function to generate a random guess within the current range
    public static int generateGuess(int lowerBound, int upperBound) {
        Random rand = new Random();
        return rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }

    // Function to receive feedback from the user
    public static String getFeedback() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Is the guess (H)igh, (L)ow, or (C)orrect? ");
        return scanner.nextLine().toUpperCase();
    }

    // Main function that runs the game
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        int lowerBound = 1, upperBound = 100;
        int guess;
        String feedback;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Think of a number between 1 and 100 and I will try to guess it.");

        // Loop until the correct guess is made
        do {
            guess = generateGuess(lowerBound, upperBound);  // Generate a guess
            System.out.println("My guess is: " + guess);

            feedback = getFeedback();  // Get feedback from the user

            // Adjust the range based on the feedback
            if (feedback.equals("H")) {
                upperBound = guess - 1;  // The guess is too high, adjust upper bound
            } else if (feedback.equals("L")) {
                lowerBound = guess + 1;  // The guess is too low, adjust lower bound
            } else if (!feedback.equals("C")) {
                System.out.println("Invalid input, please enter H, L, or C.");
            }

        } while (!feedback.equals("C"));  // Keep guessing until the correct guess is made

        System.out.println("Hooray! I guessed your number correctly!");
    }

    // Main method to start the game
    public static void main(String[] args) {
        playGame();  // Start the number guessing game
    }
}

