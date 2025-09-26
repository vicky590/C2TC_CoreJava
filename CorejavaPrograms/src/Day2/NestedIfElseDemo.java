package Day2;
import java.util.Scanner;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		NestedIfElseDemo V =  new NestedIfElseDemo();
		
		System.out.println("The largest number is ");
		V.largestNumber(A, B, C);
	}
	
	public void largestNumber(int a, int b, int c) {
		if (a > b) {
			if (a > c)
				System.out.println(a);
			else
				System.out.println(c);
		} else {
			if (c > b)
				System.out.println(c);
			else
				System.out.println(b);
		}
	}

}
