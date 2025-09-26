package Day2;

public class ContinueDemo {

	public static void main(String[] args) {
		for (int k = 5; k < 15; k++)
		{
		// Even numbers are skipped
		if (k%2 != 1)
		continue;
		// Odd numbers are printed
		System.out.print(k + " ");
		}

	}

}
