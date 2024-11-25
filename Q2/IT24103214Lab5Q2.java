import java.util.Scanner;

public class IT24103214Lab5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


// Prompt user for input
        System.out.print("Enter the number of new members introduced: ");
        int newMembers = scanner.nextInt();

        // Validate input
        if (newMembers < 0) {
            System.out.println("Input must be a number 0 or greater");
        } else {
            // Determine prize using switch statement
            String prize;
            switch (newMembers) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    prize = "Headphone";
                    break;
            }

            // Display the prize
            System.out.println("Prize is: " + prize);
        }

        scanner.close();
    }
}
