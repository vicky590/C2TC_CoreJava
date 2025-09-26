package Day2;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5};
		for (int i:a) {
			
			System.out.println(i);
		}
		
		char ch[] = {'a', 'b', 'c', 'd'};
		
		for (char c:ch) {
			System.out.print(c);
		}
		
		System.out.println("");
		
		String s[] = {"Vignesh", "Java", "Muthukumaran"};
		
		for (String b:s) {
			System.out.print(s+" ");
		}

	}

}
