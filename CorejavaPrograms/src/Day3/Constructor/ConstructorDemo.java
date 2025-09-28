package Day3.Constructor;

import java.util.Scanner;
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name, department;
		int register;
		System.out.print("Enter Student Register Number : ");
		register=sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter Student Name : ");
		name=sc.nextLine();
		
		System.out.print("Enter Department : ");
		department=sc.nextLine();

		
		System.out.println(" ");
		
		Student c1=new Student(); //default constructor invoked
		c1.setStudentName(name);
		c1.setRegisterNumber(register);
		c1.setDepartmentName(department);
		System.out.println(c1);
		
		System.out.print("Enter Student Register Number : ");
		register=sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter Student Name : ");
		name=sc.nextLine();
		
		System.out.print("Enter Student Department : ");
		department=sc.nextLine();
		
		Student c2=new Student(name, register, department); //parameterized constructor invoked);
		System.out.println(c2);
		
		sc.close();
	}

}
