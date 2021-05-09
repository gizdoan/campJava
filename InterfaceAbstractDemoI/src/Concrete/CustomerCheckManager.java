package Concrete;

import Abstract.CustomerService;
import Entities.Customer;

public abstract class CustomerCheckManager implements CustomerService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
		
		
	}

	
		
	}


