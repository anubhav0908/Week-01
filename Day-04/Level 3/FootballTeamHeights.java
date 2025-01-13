import java.util.Random;

public class FootballTeamHeights {

    // Method to find the sum of all the heights in the array
    public static int findSum(int[] heights) {
        int sum = 0;
        // Using traditional for loop
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i]; // Access each height using index
        }
        return sum;
    }

    // Method to find the mean height of the players
    public static double findMean(int[] heights) {
        int sum = findSum(heights); // Get sum of all heights
        return (double) sum / heights.length; // Calculate mean
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        // Using traditional for loop
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < shortest) {
                shortest = heights[i];
            }
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        // Using traditional for loop
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] heights = new int[11]; // Array to store the heights of 11 players

        // Generate random heights for 11 players in the range 150-250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150; // Generates a value between 150 and 250
        }

        // Calculate the sum, mean, shortest, and tallest height
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        // Display the results
        System.out.println("Heights of the players (in cms): ");
        for (int i = 0; i < heights.length; i++) {
            System.out.print(heights[i] + " "); // Access each height using index
        }
        System.out.println("\n");

        System.out.println("Sum of heights: " + sum + " cms");
        System.out.println("Mean height: " + mean + " cms");
        System.out.println("Shortest height: " + shortest + " cms");
        System.out.println("Tallest height: " + tallest + " cms");
    }
}
