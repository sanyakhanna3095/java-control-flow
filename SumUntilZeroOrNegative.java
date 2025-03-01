import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Initialize total to 0.0
        double total = 0.0;

        // Infinite while loop
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = scanner.nextDouble();
            
            // Break the loop if number is 0 or negative
            if (number <= 0) {
                break;
            }

            total += number; // Add the entered number to total
        }

        // Display the total sum
        System.out.println("The total sum is: " + total);
    }
}

