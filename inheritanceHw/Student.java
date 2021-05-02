package inheritanceHw;

public class Student extends User {
	private int studentNumber;
	
	public Student( String password, String userEmail, String userName, int studentNumber){
		super(password, userEmail, userName);
		this.studentNumber = studentNumber;
	}


	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	

}
