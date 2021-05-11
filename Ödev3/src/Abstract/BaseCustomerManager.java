package Abstract;

import Entities.Customer;

public class BaseCustomerManager implements ICustomerService {

		


	@Override
	public void Save(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Saved to database");
	}


}
