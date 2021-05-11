import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {
	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		Customer customer1 = new Customer(1 , "Barýþ" , "Demir" , "2000" , "000001");
		customerManager.Save(customer1);
		
	}
	

	}

