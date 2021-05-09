package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.AuthenticationService;
import eCommerceDemo.entities.concretes.User;

public class EmailAuthentication implements AuthenticationService{

	@Override
	public void send(User user) {
		System.out.println(user.getFirstName() + "Doðrulama kodu mailinize gönderilmiþtir.Kaydýnýzý tamamlamak için lütfen onay kodunu giriniz");
		
	}

}
