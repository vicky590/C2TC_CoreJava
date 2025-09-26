package Day2;
import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		IfElseDemo s = new IfElseDemo();
		s.ageVote(A);

		
	}
	
	public void ageVote(int age) {
		if(age>=18)
			System.out.println(" You are eligible for Voting");	
		else
			System.out.println("Sorry! You need to wait more");

		System.out.println("if else demonstration");

	}

}
