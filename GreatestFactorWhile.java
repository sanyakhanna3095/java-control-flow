import java.util.Scanner;

public class GreatestFactorWhile {
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

        // Find the greatest factor of the number besides itself using while loop
        int greatestFactor = 1;
        int counter = n - 1;
        while (counter >= 1) {
            if (n % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        System.out.println("The greatest factor of " + n + " besides itself is: " + greatestFactor);
    }
}

