import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Check if the number is a positive integer
        if (n < 1) {
            System.out.println(n + " is not a positive integer.");
            return;
        }

        // Find the greatest factor of the number besides itself
        int greatestFactor = 1;
        for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("The greatest factor of " + n + " besides itself is: " + greatestFactor);
    }
}

