import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // Check if the number is a positive integer
        if (n < 0) {
            System.out.println(n + " is not a positive integer.");
            return;
        }

        // Calculate factorial using while loop
        long factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }

        // Display the factorial
        System.out.println("The factorial of " + n + " is: " + factorial);
    }
}


