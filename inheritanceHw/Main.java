package inheritanceHw;

public class Main {
	public static void main(String[] args) {
		User user = new User();
		
		Student student = new Student("doangizem", "doangizem@gmail.com", "Gizem Do�an",2 );
		
		Instructor instructor = new Instructor("wwwww", "demirogengin@gmail.com", "Engin Demiro�", "Java+React");
		
		UserManager userManager = new UserManager();
		
		
		User[] users = {user, student, instructor};
		userManager.addMultiple(users);
		}

}
