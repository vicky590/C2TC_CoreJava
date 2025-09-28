package Day3.Constructor;

public class Student {

	private String studentName;
	 private int registerNumber;
	 private String departmentName;
	 
	// Default Constructor
	public Student() {
		System.out.println("Default Constructor");
	}
	
	//Parameterized Constructor
	//use of this keyword
	public Student(String studentName, int registerNumber, String departmentName) {
		
		this(); //calling default constructor
		
		System.out.println("Parameterized Constructor");
		this.studentName = studentName;
		this.registerNumber = registerNumber;
		this.departmentName = departmentName;
	}
	
	//Getter and Setters
	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRegisterNumber() {
		return this.registerNumber;
	}

	public void setRegisterNumber(int registerNumber) {
		this.registerNumber = registerNumber;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", registerNumber=" + registerNumber + ", departmentName="
				+ departmentName + "]";
	}

	

}
