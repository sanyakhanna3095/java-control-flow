import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
	// Initialize total to 0.0
        double total = 0.0;
        double number;

        // Use a while loop to keep taking input until user enters 0
        do {
            System.out.print("Enter a number (0 to stop): ");
            number = sc.nextDouble();
            total += number; // Add the entered number to total
        } 
	while (number != 0);

        // Display the total sum
        System.out.println("The total sum is: " + total);
    }
}

