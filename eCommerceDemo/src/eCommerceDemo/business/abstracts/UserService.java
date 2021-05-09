package eCommerceDemo.business.abstracts;

import java.util.List;

import eCommerceDemo.entities.concretes.User;

public interface UserService {
	void log(String email, String password);
	List<User> getAll();
	void register(User user);
	static void add(User user1, User user2) {
		// TODO Auto-generated method stub
		
	}

}
