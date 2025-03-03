import java.util.Scanner;

public class FriendsDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get ages and heights of the friends
        System.out.print("Enter the age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter the height of Amar: ");
        double heightAmar = sc.nextDouble();

        System.out.print("Enter the age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter the height of Akbar: ");
        double heightAkbar = sc.nextDouble();

        System.out.print("Enter the age of Anthony: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Enter the height of Anthony: ");
        double heightAnthony = sc.nextDouble();

        // Find the youngest friend
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        if (youngestAge == ageAmar) {
            System.out.println("The youngest friend is Amar.");
        }
	 else if (youngestAge == ageAkbar) {
            System.out.println("The youngest friend is Akbar.");
        }
	 else {
            System.out.println("The youngest friend is Anthony.");
        }

        // Find the tallest friend
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        if (tallestHeight == heightAmar) {
            System.out.println("The tallest friend is Amar.");
        }
	else if (tallestHeight == heightAkbar) {
            System.out.println("The tallest friend is Akbar.");
        } 
	else {
            System.out.println("The tallest friend is Anthony.");
        }
    }
}

