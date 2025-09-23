package Day1;

public class TypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte
		
		byte b = 20;
		int i = b;
		System.out.println(i);
		
		
		// float
		
		float f = 36.1423f;
		double d = f;
		System.out.println(d);
		
		// character
		
		char ch = 'A';
		int j = ch;
		float k = ch;
		System.out.println(j);
		System.out.println(k);
		
		char var1 = '\u00A7';
		int i4 = var1;
		System.out.println(i4);
		
		double f1 = 10.522f;	
		long l = (long) f1;
		System.out.println(l);

		long l1 = 9233720368506l;
		int i2 = (int) l1;
		System.out.println(i2);

		float f2 = 34.56f;
		int i1 = (int) f2;
		System.out.println(i1);

		byte b1 = 90;
		char ch1 = (char) b1;
		System.out.println(ch1);

	}

}
