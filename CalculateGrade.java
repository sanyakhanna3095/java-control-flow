import java.util.Scanner;

public class CalculateGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input for the marks of the three subjects
        System.out.print("Enter marks for Physics: ");
        int physics = sc.nextInt();
        
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = sc.nextInt();
        
        System.out.print("Enter marks for Maths: ");
        int maths = sc.nextInt();

        // Calculate the total marks and percentage
        int totalMarks = physics + chemistry + maths;
        double percentage = (double) totalMarks / 3;

        // Output the percentage
        System.out.println("The Average Mark is: " + percentage + "%");

        // Determine grade and remarks based on the percentage
        if (percentage >= 80) {
            System.out.println("Grade: A (Level 4, above agency-normalized standards)");
        } 
	else if (percentage >= 70) {
            System.out.println("Grade: B (Level 3, at agency-normalized standards)");
        } 
	else if (percentage >= 60) {
            System.out.println("Grade: C (Level 2, below, but approaching agency-normalized standards)");
        } 
	else if (percentage >= 50) {
            System.out.println("Grade: D (Level 1, well below agency-normalized standards)");
        } 
	else if (percentage >= 40) {
            System.out.println("Grade: E (Level 1-, too below agency-normalized standards)");
        } 
	else {
            System.out.println("Grade: R (Remedial standards)");
        }
    }
}
