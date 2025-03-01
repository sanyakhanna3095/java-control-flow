import java.util.Scanner;

public class DivisibleBy5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		//Take user input
		System.out.print("Enter input number: ");
		int n=sc.nextInt();

		// Check if the number is divisible by 5
		if(n%5==0){
			System.out.println("Is the number " + n + " divisible by 5? Yes");
		}
		else{
			System.out.println("Is the number " + n + " divisible by 5? No");
		}
	}

}
