package eCommerceDemo.core;

import eCommerceDemo.GoogleLoggerManager;

public class GoogleLoggerManagerAdapter implements LoggerService {
	
	@Override
	public void logToSystem(String message) {
		GoogleLoggerManager googleLoggerManager = new GoogleLoggerManager();
		googleLoggerManager.log(message);
	}

}
