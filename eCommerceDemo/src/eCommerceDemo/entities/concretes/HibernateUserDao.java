package eCommerceDemo.entities.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceDemo.dataAccess.abstracts.UserDao;


public class HibernateUserDao implements UserDao{
	
	private ArrayList<User> users;
	
	public HibernateUserDao()
	{
		users = new ArrayList<User>();
	}

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println(user.getFirstName() + "Kayd�n�z ba�ar�yla ger�ekle�ti");
		
	}

	@Override
	public void update(User user) {
		if(users.contains(user)) {
			System.out.println(user.getFirstName() + "Bilgileriniz g�ncellendi");
			
		}else {
			System.out.println("Kullan�c� bulunamad�");
			
		}
		
	}

	public void delete(User user) {
		if(users.contains(user)) {
			users.remove(user);
			System.out.println(user.getFirstName() + "Kayd�n�z silindi");
			
		}else {
			System.out.println("Kullan�c� bulunamad�");
			
		}
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
