import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void testNewAccount() {

		// create object of Account class
		Account objAccount = new Account(100);

		// expected balance is 0 as per requirement given
		int expectedBalance = 0;

		// getting actual balance using balance() function
		int actualBalance = objAccount.balance();

		// Testing expected and actual results
		assertEquals(expectedBalance, actualBalance);
	}

	@Test
	public void testWithdrawnMoney() {

		Account objAccount = new Account(100);

		// getting initial balance of customer
		int initialBalance = objAccount.balance();

		// calling function to withdrawn money
		objAccount.withdraw(50);

		// expected balance should be initial - 50
		int expectedBalance = initialBalance - 50;
		// getting actual balance using balance() function
		int actualBalance = objAccount.balance();

		// Testing expected and actual results
		assertEquals(expectedBalance, actualBalance);
	}

	@Test
	public void testDepositMoney() {

		Account objAccount = new Account(100);

		// getting initial balance of customer
		int initialBalance = objAccount.balance();

		// calling function to deposit money
		objAccount.deposit(50);

		// expected balance should be initial + 50
		int expectedBalance = initialBalance + 50;
		// getting actual balance using balance() function
		int actualBalance = objAccount.balance();

		// Testing expected and actual results
		assertEquals(expectedBalance, actualBalance);
	}

	@Test
	public void testWithdrawnMoreMoneyThanBalance() {

		// create object of Account class
		Account objAccount = new Account(100);

		// getting initial balance of customer
		int initialBalance = objAccount.balance();

		// calling function to withdraw money
		objAccount.withdraw(150);

		// expected balance should be same as initial
		int expectedBalance = initialBalance;
		// getting actual balance using balance() function
		int actualBalance = objAccount.balance();

		// Testing expected and actual results
		assertEquals(expectedBalance, actualBalance);
	}

	@Test
	public void testWithdrawnInvalidMoney() {

		// create object of Account class
		Account objAccount = new Account(100);

		// getting initial balance of customer
		int initialBalance = objAccount.balance();

		// calling function to withdraw money
		objAccount.withdraw(-50);

		// expected balance should be same as initial
		int expectedBalance = initialBalance;
		// getting actual balance using balance() function
		int actualBalance = objAccount.balance();

		// Testing expected and actual results
		assertEquals(expectedBalance, actualBalance);
	}

	@Test
	public void testDepositInvalidMoney() {

		Account objAccount = new Account(100);

		// getting initial balance of customer
		int initialBalance = objAccount.balance();

		// calling function to deposit money
		objAccount.deposit(-50);

		// expected balance should be same as initial
		int expectedBalance = initialBalance;
		// getting actual balance using balance() function
		int actualBalance = objAccount.balance();

		// Testing expected and actual results
		assertEquals(expectedBalance, actualBalance);
	}

}
