import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Assume the number is prime initially
        boolean isPrime = true;

        // Check for prime number if the number is greater than 1
        if (n <= 1) {
	    // Numbers less than or equal to 1 are not prime
	    isPrime =false;
        } 
	else {
            // Loop from 2 to the square root of the number
            for (int i = 2; i <= n / 2; i++) {
                // If the number is divisible by any number between 2 and num/2, it is not prime
                if (n % i == 0) {
                    //Number is not prime
		    isPrime = false;
                    // Exit the loop as we found a divisor
		    break;
                }
            }
        }

	//Result
        if (isPrime) {
            System.out.println(n + " is a Prime Number.");
        } 
	else {
            System.out.println(n + " is not a Prime Number.");
        }
    }
}
