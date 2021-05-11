package Concrete;
import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	private ICustomerCheckService customerChechkService;
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerChechkService=customerCheckService;
	}
	
	
	
	
	@Override
	public void Save(Customer customer) {
		if(customerChechkService.CheckIfRealPerson(customer)==true) {
			super.Save(customer);
		     
		}
		else{
			System.out.println("Not a valid person");
			}
		
	}
	
	

}
