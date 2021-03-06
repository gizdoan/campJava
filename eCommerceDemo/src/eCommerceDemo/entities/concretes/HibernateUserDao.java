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
		System.out.println(user.getFirstName() + "Kaydınız başarıyla gerçekleşti");
		
	}

	@Override
	public void update(User user) {
		if(users.contains(user)) {
			System.out.println(user.getFirstName() + "Bilgileriniz güncellendi");
			
		}else {
			System.out.println("Kullanıcı bulunamadı");
			
		}
		
	}

	public void delete(User user) {
		if(users.contains(user)) {
			users.remove(user);
			System.out.println(user.getFirstName() + "Kaydınız silindi");
			
		}else {
			System.out.println("Kullanıcı bulunamadı");
			
		}
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
