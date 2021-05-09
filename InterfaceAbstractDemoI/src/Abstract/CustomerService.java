package Abstract;

import Entities.Customer;

public interface CustomerService {
	public void Add(Customer customer);

	boolean CheckIfRealPerson(Customer customer);

}
