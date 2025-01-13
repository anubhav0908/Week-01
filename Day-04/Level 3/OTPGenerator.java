public class OTPGenerator {

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        // Generate a random number between 100000 and 999999
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to check if OTP numbers are unique
    public static boolean areOTPsUnique(int[] otps) {
        // Use nested for loops to check for duplicates without enhanced for loop
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    // If any OTP is the same as another, return false
                    return false;
                }
            }
        }
        // If no duplicates were found, return true
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10]; // Array to store 10 OTP numbers

        // Generate 10 OTP numbers and store them in the array
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        // Print the generated OTP numbers using regular for loop (not enhanced for loop)
        System.out.println("Generated OTPs:");
        for (int i = 0; i < otps.length; i++) {
            System.out.println(otps[i]);
        }

        // Check if the OTP numbers are unique
        boolean unique = areOTPsUnique(otps);
        if (unique) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("There are duplicate OTPs.");
        }
    }
}
