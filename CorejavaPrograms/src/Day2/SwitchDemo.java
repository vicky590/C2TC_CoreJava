package Day2;

public class SwitchDemo {

	public static void main(String[] args) {
		char x = 't';
		switch(x) {
		case 'a':
		case 'A':
			System.out.println(x+" is a Letter");
			break;
		case 'b':
		case 'B':
			System.out.println(x+" is a Ball");
			break;
		case 'T':
		case 't':
			System.out.println(x+" is a Tubelight");
			break;
		case 'd':
		case 'D':
			System.out.println(x+" is a Dog");
			break;
		case 'p':
		case 'P':
			System.out.println(x+" is a Parrot");
			break;
		case 'f':
		case 'F':
			System.out.println(x+" is a Fish");
			break;
		default:
			System.out.println(x+" is other than letter, Ball, Tubelight or Dog, Parrot, Fish ");
			break;
		}

	}

}
