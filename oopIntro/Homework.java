package oopIntro;

public class Homework {
	public static void main(String[] args) {
		
		Course course1 = new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�","Engin Demiro�",100,"C#+Angular" );
		Course course2 = new Course(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�","Engin Demiro�",100,"Java+React" );
		Course course3 = new Course(3,"Programlamaya Giri� i�in Temel Kurs","Engin Demiro�",100,"Temel Kurs");
		
		Course[] courses = {course1,course2,course3};
		
		for (Course course : courses) {
			System.out.println(course.name);
			
		}
		System.out.println(courses.length);
		
	}
	

};
