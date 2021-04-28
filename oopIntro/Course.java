package oopIntro;

public class Course {
	public Course() {
		System.out.println();
}

	
	public Course(int id, String name, String instructor, double participationRate, String detail ) {
		this();
		this.id = id;
		this.name = name;
		this.instructor = instructor;
		this.participationRate = participationRate;
		this.detail = detail;
	}
	int id;
	String name;
	String instructor;
	double participationRate;
	String detail;
	
};
	
