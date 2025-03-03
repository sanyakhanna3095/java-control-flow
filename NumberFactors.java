import java.util.Scanner;

public class NumberFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	//Take user input
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Check if the number is a positive integer
        if (n < 1) {
            System.out.println(n + " is not a positive integer.");
            return;
        }

        // Find and print the factors of the number
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}

