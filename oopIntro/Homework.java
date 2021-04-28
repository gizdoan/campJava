package oopIntro;

public class Homework {
	public static void main(String[] args) {
		
		Course course1 = new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý","Engin Demiroð",100,"C#+Angular" );
		Course course2 = new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý","Engin Demiroð",100,"Java+React" );
		Course course3 = new Course(3,"Programlamaya Giriþ için Temel Kurs","Engin Demiroð",100,"Temel Kurs");
		
		Course[] courses = {course1,course2,course3};
		
		for (Course course : courses) {
			System.out.println(course.name);
			
		}
		System.out.println(courses.length);
		
	}
	

};
