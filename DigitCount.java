import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;

        // In case of negative input
        n = Math.abs(number);

        // Loop to count digits until the number becomes 0
        while (n != 0) {
            n /= 10;
            count++;
        }

        // If the number was 0, set count to 1 since 0 has 1 digit
        if (count == 0) {
            count = 1;
        }

        System.out.println("The number has " + count + " digits.");
    }
}
