import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         // Take user input
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();
        sc.nextLine();  // Consume newline character
        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.nextLine();

        // Use switch...case to perform the required operation
        switch(op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + first + " + " + second + " = " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result: " + first + " - " + second + " = " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result: " + first + " * " + second + " = " + result);
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + first + " / " + second + " = " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid Operator.");
                break;
        }

    }
}
