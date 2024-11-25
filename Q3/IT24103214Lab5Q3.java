import java.util.Scanner;

public class IT24103214Lab5Q3 {
    public static void main(String[] args) {
        // Constants
        final double ROOM_CHARGE_PER_DAY = 48000.0;
        final int DISCOUNT_3_TO_4_DAYS = 10;
        final int DISCOUNT_5_OR_MORE_DAYS = 20;

        Scanner scanner = new Scanner(System.in);

        // Input start date and end date
        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

        // Validate inputs
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
        } else if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
        } else {
            // Calculate number of days reserved
            int daysReserved = endDate - startDate;

            // Determine discount rate
            int discountRate = 0;
            if (daysReserved >= 3 && daysReserved <= 4) {
                discountRate = DISCOUNT_3_TO_4_DAYS;
            } else if (daysReserved >= 5) {
                discountRate = DISCOUNT_5_OR_MORE_DAYS;
            }

            // Calculate total amount
            double totalCharge = ROOM_CHARGE_PER_DAY * daysReserved;
            double discount = totalCharge * discountRate / 100;
            double totalAmount = totalCharge - discount;

            // Display results
            System.out.println("\nRoom Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
            System.out.println("Number of Days Reserved: " + daysReserved);
            System.out.println("Total Amount to be Paid: " + totalAmount + "/=");
        }

        scanner.close();
    }
}
