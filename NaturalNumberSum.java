import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check if the number is a natural number (positive integer)
        if (n >= 0) {
            int sum = (n * (n + 1)) / 2; // Formula to calculate sum of n natural numbers
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } 
	else {
            System.out.println("The number " + n + " is not a natural number");
        }

    }
} 

