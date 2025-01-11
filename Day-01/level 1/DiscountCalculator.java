public class DiscountCalculator {
    public static void main(String[] args) {
        // Given values
        int fee = 125000; // Original fee
        int discountPercent = 10; // Discount percentage

        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100.0;

        // Calculate the final fee after discount
        double finalFee = fee - discount;

        // Output the result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
