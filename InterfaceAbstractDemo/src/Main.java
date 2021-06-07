import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import DataAccess.Abstract.BaseCustomerManager;
import DataAccess.Concrete.NeroCustomerManager;
import DataAccess.Concrete.StarbucksCustomerManager;
import Entities.Concrete.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer();
		customer.setFirstName("Ömer Faruk");
		customer.setLastName("Çelik");
		customer.setDateOfBirth(LocalDate.of(1994,9,15));
		customer.setNationalityID("12345678901");
		try {
			customerManager.save(customer);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}

}
