import static org.junit.Assert.*;

import org.junit.Test;

public class BankTest {

	@Test
	public void testNewBankCreation() {

		// Creating object of Bank class
		Bank bankObj = new Bank();

		// expected number of customers i.e. 0
		int expectedNumberOfCustomers = 0;

		// actual number of customers
		int actualNumberOfCustomers = bankObj.getNumberOfCustomers();

		// Testing expected and actual results
		assertEquals(expectedNumberOfCustomers, actualNumberOfCustomers);

	}

	@Test
	public void testAddNewCustomerToBank() {

		// Creating object of Bank class
		Bank bankObj = new Bank();

		// adding 2 initial customers
		bankObj.addCustomer("Joban", 100);
		bankObj.addCustomer("Gundeep", 150);

		// asserting if 2 customers are added
		assertEquals(2, bankObj.getNumberOfCustomers());

		// getting initial number of customer before adding new customer
		int initialCustomerCount = bankObj.getNumberOfCustomers();

		// adding new customer
		bankObj.addCustomer("Harman", 200);

		// expected output is 1 more than initial customer count
		int expectedNumberOfCustomers = initialCustomerCount + 1;

		// actual number of customers using class function
		int actualNumberOfCustomers = bankObj.getNumberOfCustomers();

		// Testing expected and actual results
		assertEquals(expectedNumberOfCustomers, actualNumberOfCustomers);

	}

	@Test
	public void testAddExistingCustomerToBank() {

		// Creating object of Bank class
		Bank bankObj = new Bank();

		// adding 2 initial customers
		bankObj.addCustomer("Joban", 100);
		bankObj.addCustomer("Gundeep", 150);
		bankObj.addCustomer("Harman", 200);

		// initial assert if customers are added
		assertEquals(3, bankObj.getNumberOfCustomers());

		// getting number of customer before adding new customer
		int initialCustomerCount = bankObj.getNumberOfCustomers();

		// adding same customer
		bankObj.addCustomer("Harman", 200);
		// expected output is same count of customer as customer already exist
		int expectedNumberOfCustomers = initialCustomerCount;

		// actual number of customers
		int actualNumberOfCustomers = bankObj.getNumberOfCustomers();

		// Testing expected and actual results
		assertEquals(expectedNumberOfCustomers, actualNumberOfCustomers);

	}

	@Test
	public void testRemoveExistingCustomerFromBank() {

		// Creating object of Bank class
		Bank bankObj = new Bank();

		// adding 3 initial customers
		bankObj.addCustomer("Joban", 100);
		bankObj.addCustomer("Gundeep", 150);
		bankObj.addCustomer("Harman", 200);

		// getting initial number of customer before adding new customer
		int initialCustomerCount = bankObj.getNumberOfCustomers();

		// removing customer
		bankObj.removeCustomer("Harman");

		// expected output is 1 less than initial customer count
		int expectedNumberOfCustomers = initialCustomerCount - 1;

		// actual number of customers
		int actualNumberOfCustomers = bankObj.getNumberOfCustomers();

		// Testing expected and actual results
		assertEquals(expectedNumberOfCustomers, actualNumberOfCustomers);

	}

	@Test
	public void testRemoveNonExistingCustomerFromBank() {

		// Creating object of Bank class
		Bank bankObj = new Bank();

		// adding 2 initial customers
		bankObj.addCustomer("Joban", 100);
		bankObj.addCustomer("Gundeep", 150);

		// getting initial number of customer before adding new customer
		int initialCustomerCount = bankObj.getNumberOfCustomers();

		// removing customer
		bankObj.removeCustomer("Harman");

		// expected number of customers should be same as initial customer count
		int expectedNumberOfCustomers = initialCustomerCount;

		// actual number of customers
		int actualNumberOfCustomers = bankObj.getNumberOfCustomers();

		// Testing expected and actual results
		assertEquals(expectedNumberOfCustomers, actualNumberOfCustomers);

	}

	@Test
	public void testTranferMoneyWithinBankCustomers() {

		// Creating object of Bank class
		Bank bankObj = new Bank();

		// adding 2 initial customers
		bankObj.addCustomer("Joban", 100);
		bankObj.addCustomer("Gundeep", 150);

		// Retrieving customer objects from bank
		Customer customer1 = bankObj.getCustomers().get(0);
		Customer customer2 = bankObj.getCustomers().get(1);

		// intial balance from Customer1 and Customer 2
		int customer1Balance = customer1.getAccount().balance();
		int customer2Balance = customer2.getAccount().balance();

		// Transfering money within customer 1 and 2
		bankObj.transferMoney(customer1, customer2, 100);

		int expectedCustomer1Bal = customer1Balance - 100;
		int expectedCustomer2Bal = customer2Balance + 100;

		int actualCustomer1Bal = customer1.getAccount().balance();
		int actualCustomer2Bal = customer2.getAccount().balance();

		// Testing expected and actual results
		assertEquals(expectedCustomer1Bal, actualCustomer1Bal);
		assertEquals(expectedCustomer2Bal, actualCustomer2Bal);

	}

	@Test
	public void testTranferMoreMoneyWithinBankCustomersThanBalance() {

		// Creating object of Bank class
		Bank bankObj = new Bank();

		// adding 2 initial customers
		bankObj.addCustomer("Joban", 50);
		bankObj.addCustomer("Gundeep", 150);

		// Retrieving customer objects from bank
		Customer customer1 = bankObj.getCustomers().get(0);
		Customer customer2 = bankObj.getCustomers().get(1);

		// intial balance from Customer1 and Customer 2
		int customer1Balance = customer1.getAccount().balance();
		int customer2Balance = customer2.getAccount().balance();

		// Transferring money within customer 1 and 2
		bankObj.transferMoney(customer1, customer2, 100);

		int expectedCustomer1Bal = customer1Balance;
		int expectedCustomer2Bal = customer2Balance;

		int actualCustomer1Bal = customer1.getAccount().balance();
		int actualCustomer2Bal = customer2.getAccount().balance();

		// Testing expected and actual results
		assertEquals(expectedCustomer1Bal, actualCustomer1Bal);
		assertEquals(expectedCustomer2Bal, actualCustomer2Bal);

	}

}
