import java.util.Arrays;

public class RandomStats {

    // Method to generate an array of random 4-digit numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        
        for (int i = 0; i < size; i++) {
            // Generating a random 4-digit number
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000; // 1000 to 9999
        }
        
        return randomNumbers;
    }

    // Method to find the average, min, and max of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double[] result = new double[3];
        int min = numbers[0];
        int max = numbers[0];
        double sum = 0;
        
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        result[0] = sum / numbers.length;  // Average
        result[1] = min;                   // Minimum
        result[2] = max;                   // Maximum
        
        return result;
    }

    public static void main(String[] args) {
        int size = 5; // Generate 5 random 4-digit numbers
        
        // Generate the array of random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(size);
        
        // Find the average, min, and max of the generated numbers
        double[] stats = findAverageMinMax(randomNumbers);
        
        // Output the generated numbers and the stats
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));
        System.out.println("Average: " + stats[0]);
        System.out.println("Minimum: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
    }
}
