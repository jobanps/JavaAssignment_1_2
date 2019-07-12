import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void testNewCustomerWithZeroBalance() {

		// Creating object of class Customer
		Customer customerObj = new Customer("Joban", 0);
		try {
			// Retrieving customer's account in Account object
			Account accountObj = customerObj.getAccount();

			// expected balance is 0
			int expectedBalance = 0;
			// getting balance using balance function
			int actualBalance = accountObj.balance();

			// Testing expected and actual results
			assertEquals(expectedBalance, actualBalance);

		} catch (Exception e) {
			fail("Test case failed");
		}
	}

	@Test
	public void testNewCustomerInitialBalance() {

		// Creating object of class Customer
		Customer customerObj = new Customer("Joban", 100);
		try {
			// Retrieving customer's account in Account object
			Account accountObj = customerObj.getAccount();

			// expected balance is 100 as passed in customer creation
			int expectedBalance = 100;
			// getting balance using balance function
			int actualBalance = accountObj.balance();

			// Testing expected and actual results
			assertEquals(expectedBalance, actualBalance);

		} catch (Exception e) {
			fail("Test case failed");
		}
	}

	@Test
	public void testNewCustomerWithoutSpecifingBalance() {

		// Creating object of class Customer
		Customer customerObj = new Customer("Joban", 0);
		try {
			// Retrieving customer's account in Account object
			Account accountObj = customerObj.getAccount();

			// expected balance is 0 as keeping it optional
			int expectedBalance = 0;
			// getting balance using balance function
			int actualBalance = accountObj.balance();

			// Testing expected and actual results
			assertEquals(expectedBalance, actualBalance);

		} catch (Exception e) {
			fail("Test case failed");
		}
	}

}
