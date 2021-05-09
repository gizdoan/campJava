package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	private CustomerCheckService  customerCheckService;

	@Override
	public void Add(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			this.Add(customer);

		}else {
			System.out.println("Not a valid person");
		
		
		
		
	}

	
	}

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	

	

	

}
