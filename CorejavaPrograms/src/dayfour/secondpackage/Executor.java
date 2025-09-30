package dayfour.secondpackage;
import dayfour.firstpackage.Base;
public class Executor extends Base {

	public static void main(String[] args) {
		Base b = new Base();
		Executor c = new Executor();
		// private, default and protected members can't access

				/*
				 * b1.varPrivate=21; b1.methodPrivate(); b1.varDefault=11; b1.methodDefault();
				 * b1.varProtected=31; b1.methodProtected();
				 */

				b.methodPublic();
				b.varPublic = 69;
				b.methodPublic();
				// access protected the method and protected variable
				c.methodProtected();
				c.varProtected = 70;
				System.out.println("field is access"+ c.varProtected);
			}
	
	
}


