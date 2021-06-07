package DataAccess.Concrete;

import DataAccess.Abstract.ICustomerCheckService;
import Entities.Concrete.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}


}
