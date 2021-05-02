package inheritanceHw;

public class Instructor extends User{
	private String course;
	
	public Instructor(String password, String userEmail, String userName, String course){
		super(password, userEmail, userName);
		this.course = course;

	}


	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	}
	

