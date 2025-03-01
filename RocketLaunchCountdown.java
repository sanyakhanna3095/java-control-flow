import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get the starting number for the countdown from the user
        System.out.print("Enter the countdown start number: ");
        int counter = scanner.nextInt();

        // Use a while loop to count down to 1
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrement the counter
        }
      
    }
}

