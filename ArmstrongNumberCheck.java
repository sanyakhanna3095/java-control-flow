import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Initialize sum and store the original number
        int sum = 0;
        int originalNumber = n;

        // Calculate the sum of the cubes of its digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Get the last digit
            sum += Math.pow(digit, 3); // Add the cube of the digit to the sum
            originalNumber /= 10; // Remove the last digit
        }

        // Check if the sum equals the original number
        if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}

