public class NullPointerDemo {

    // Method to generate NullPointerException
    public static void generateNullPointerException() {
        String text = null; // Initialize the string variable to null
        
        // Attempting to call a method on a null reference
        System.out.println("Length of the string: " + text.length()); // This will throw NullPointerException
    }

    // Method to demonstrate NullPointerException with exception handling
    public static void handleNullPointerException() {
        String text = null; // Initialize the string variable to null

        try {
            // Attempting to call a method on a null reference inside try block
            System.out.println("Length of the string: " + text.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            // Catching and handling the NullPointerException
            System.out.println("NullPointerException caught: String is null, cannot call methods on null.");
        }
    }

    public static void main(String[] args) {
        // Call the method to generate the NullPointerException
        System.out.println("Calling generateNullPointerException():");
        try{
			generateNullPointerException(); // This will throw NullPointerException
		}
		catch(NullPointerException e){
			System.out.println("exception caught in main method"+ e.getMessage());
		}
      
      
        handleNullPointerException(); // This will handle the NullPointerException
    }
}
