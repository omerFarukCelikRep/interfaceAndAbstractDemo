package DataAccess.Abstract;

import Entities.Concrete.Customer;

public interface ICustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
