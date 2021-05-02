package inheritanceHw;

public class StudentManager extends UserManager {
	public void add(Student student) {
		System.out.println(student.getUserName() + "kaydoldunuz");
	}

}
