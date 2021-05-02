package inheritanceHw;



public class InstructorManager extends UserManager {
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getCourse() + "eklendi");
	}
	
	

}
