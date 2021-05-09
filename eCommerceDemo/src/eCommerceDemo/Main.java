package eCommerceDemo;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.concretes.EmailAuthentication;
import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.business.concretes.UserValidation;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.HibernateUserDao;
import eCommerceDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User("Eliz", "Daðlý", "eliz_dagli11@gmail.com", "eliz35", 1);
		User user2 = new User("Hilal", "Deniz", "h-deniz@gmail.com", "123456", 2);
		
		
		UserDao userDao = new HibernateUserDao();
		
		UserService userService = new UserManager(new HibernateUserDao(), new EmailAuthentication(), new UserValidation(userDao), new GoogleLoggerManager());
				
        userDao.add(user1);		
		
		System.out.println("--------------------------");
	
		userService.register(user2);
		
		System.out.println("--------------------------");
		
		userService.log(user2.getEmail(), user2.getPassword());
		
		System.out.println("--------------------------");
		
		userService.log(user2.getEmail(), "123456");
		
		System.out.println("--------------------------");	


		
		

	}

}
