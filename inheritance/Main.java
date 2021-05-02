package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer engin = new IndividualCustomer();
		engin . customerNumber="12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada . companyName = "78910";
		
		UnionCustomer abc = new UnionCustomer();
		abc.customerNumber = "9999";
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(hepsiBurada);
		//customerManager.add(engin);
		//customerManager.add(abc);
		
		Customer[] customers = {engin, abc, hepsiBurada};
		
		customerManager.addMultiple(customers);
		
	}

}
