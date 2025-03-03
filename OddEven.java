import java.util.Scanner;

public class OddEven {
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

        // Iterate from 1 to the entered number and check for odd or even
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an even number.");
            } else {
                System.out.println(i + " is an odd number.");
            }
        }
    }
}

