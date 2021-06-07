package DataAccess.Concrete;

import DataAccess.Abstract.BaseCustomerManager;
import DataAccess.Abstract.ICustomerCheckService;
import Entities.Concrete.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	private ICustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		_customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws Exception {
		if(_customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			
			throw new Exception("Not a valid person");
		}
		
	}

}
