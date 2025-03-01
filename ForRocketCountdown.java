import java.util.Scanner;

public class ForRocketCountdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get the starting number for the countdown from the user
        System.out.print("Enter the countdown start number: ");
        int counter = scanner.nextInt();

        // Use a for loop to count down to 1
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

