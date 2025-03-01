import java.util.*;

public class CanVote{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr the input age: ");
		int age=sc.nextInt();

		//check if age is eual to or more than 18 or not
		if(age>=18){
			System.out.print("The person can vote.");
		}
		else{
			System.out.print("The person cannot vote.");
		}
	}
}
