import java.util.Scanner;

public class FactorialCalculatorFor {
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

        // Calculate factorial using for loop
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        // Display the factorial
        System.out.println("The factorial of " + n + " is: " + factorial);
    }
}

