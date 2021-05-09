package InterfaceAbstractDemo;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;

public class Main {
	static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.Add("1997,10,5", "Gizem", "Doðan", "47650533182");
	}

}
