package eCommerceDemo.business.concretes;

import java.util.List;

import eCommerceDemo.GoogleLoggerManager;
import eCommerceDemo.business.abstracts.AuthenticationService;
import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.abstracts.ValidationService;
import eCommerceDemo.core.LoggerService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.HibernateUserDao;
import eCommerceDemo.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private LoggerService loggerService;
	private ValidationService validationService;
	private AuthenticationService authenticationService;

	public UserManager(UserDao userDao, LoggerService loggerService, ValidationService validationService, AuthenticationService authenticationService) {
		super();
		this.setUserDao(userDao);
		this.setLoggerService(loggerService);
		this.setValidationService(validationService);
		this.setAuthenticationService(authenticationService);
		
		
	}

	public UserManager(HibernateUserDao userDao2, EmailAuthentication emailAuthentication,
			UserValidation validationService2, GoogleLoggerManager googleLoggerManager) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void register(User user) {
		if(validationService.validate(user)) {
			authenticationService.send(user);
			userDao.add(user);
			System.out.println("Kayd�n�z ba�ar�yla ger�ekle�tirildi");
			
		}else {
			System.out.println("Kayd�n�z tamamlanamad�");
		}
		
			
		}
	@Override
	public void log(String email, String password) {
		for(User user:userDao.getAll()) {
			
			if(user.getEmail().equals(email)&&user.getPassword().equals(password)) {
				loggerService.logToSystem("Google ile giri� yap�ld�");
				System.out.println("Ba�ar�yla giri� yapt�n�z");
			}else if(!user.getEmail().contains(email)){
				System.out.println("Kullan�c� kayd�n�z bulunamad�");
			}else {
				System.out.println("Kullan�c� ad�n�z ya da parolan�z yanl��");
			}
			
		}
	}
	

	

	@Override
	public List<User> getAll() {
		return null;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public LoggerService getLoggerService() {
		return loggerService;
	}

	public void setLoggerService(LoggerService loggerService) {
		this.loggerService = loggerService;
	}

	public ValidationService getValidationService() {
		return validationService;
	}

	public void setValidationService(ValidationService validationService) {
		this.validationService = validationService;
	}

	public AuthenticationService getAuthenticationService() {
		return authenticationService;
	}

	public void setAuthenticationService(AuthenticationService authenticationService) {
		this.authenticationService = authenticationService;
	}


	

}
