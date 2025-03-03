import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        // Loop through all numbers from 1 to number - 1 to find divisors
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;  // Add the divisor to sum
            }
        }

        // Check if the sum of divisors is greater than the number itself
        if (sum > n) {
            System.out.println(n + " is an Abundant Number.");
        } 
	else {
            System.out.println(n + " is Not an Abundant Number.");
        }
    }
}
