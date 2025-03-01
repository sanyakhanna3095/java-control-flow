import java.util.Scanner;

public class SumOfNNaturalNumberFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if the number is a natural number
        if (n < 1) {
            System.out.println(n + " is not a natural number.");
            return;
        }

        // Calculate sum using formula
        int formulaSum = n * (n + 1) / 2;

        // Calculate sum using for loop
        int loopSum = 0;
        for (int i = 1; i <= n; i++) {
            loopSum += i;
        }

        // Display the results
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Sum using for loop: " + loopSum);

        // Check if results match
        if (formulaSum == loopSum) {
            System.out.println("Both computations are correct!");
        } else {
            System.out.println("There is a discrepancy in the results.");
        }
    }
}

