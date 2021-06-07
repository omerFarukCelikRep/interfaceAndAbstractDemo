package DataAccess.Abstract;

import Entities.Concrete.Customer;

public interface ICustomerService {
	void save(Customer customer) throws Exception;
}
