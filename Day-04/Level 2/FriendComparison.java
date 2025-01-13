import java.util.Scanner;

public class FriendComparison {

    // Method to find the youngest friend
    public static String findYoungest(int[] ages) {
        int minAge = ages[0];
        int index = 0;

        // Loop through the array to find the minimum age
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                index = i;
            }
        }

        // Return the name of the youngest friend based on the index
        if (index == 0) {
            return "Amar";
        } else if (index == 1) {
            return "Akbar";
        } else {
            return "Anthony";
        }
    }

    // Method to find the tallest friend
    public static String findTallest(int[] heights) {
        int maxHeight = heights[0];
        int index = 0;

        // Loop through the array to find the maximum height
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                index = i;
            }
        }

        // Return the name of the tallest friend based on the index
        if (index == 0) {
            return "Amar";
        } else if (index == 1) {
            return "Akbar";
        } else {
            return "Anthony";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Arrays to store the ages and heights of the three friends
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Take input for the ages of Amar, Akbar, and Anthony
        System.out.print("Enter Amar's age: ");
        ages[0] = input.nextInt();
        System.out.print("Enter Akbar's age: ");
        ages[1] = input.nextInt();
        System.out.print("Enter Anthony's age: ");
        ages[2] = input.nextInt();

        // Take input for the heights of Amar, Akbar, and Anthony
        System.out.print("Enter Amar's height (in cm): ");
        heights[0] = input.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        heights[1] = input.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        heights[2] = input.nextInt();

        // Find the youngest friend
        String youngest = findYoungest(ages);
        System.out.println("The youngest friend is: " + youngest);

        // Find the tallest friend
        String tallest = findTallest(heights);
        System.out.println("The tallest friend is: " + tallest);

        input.close(); // Close the scanner
    }
}
