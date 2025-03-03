import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if the number is a natural number
        if (n < 1) {
            System.out.println(n + " is not a natural number.");
            return;
        }

        // Calculate sum using formula
        int formulaSum = n * (n + 1) / 2;

        // Calculate sum using while loop
        int loopSum = 0;
        int counter = 1;
        while (counter <= n) {
            loopSum += counter;
            counter++;
        }

        // Display the results
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Sum using while loop: " + loopSum);

        // Check if results match
        if (formulaSum == loopSum) {
            System.out.println("Match!");
        } 
	else {
            System.out.println("Different X");
        }
    }
}

