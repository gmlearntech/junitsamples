package com.gmsingh.learning.junit;

import static org.hamcrest.CoreMatchers.isA;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ApplicationServiceImplTest {

	AccountServiceImpl accountService = new AccountServiceImpl();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreateNewAccount() {
		//fail("Not yet implemented");
		Account newAccount = new Account();
		newAccount.setName("Henry");
		newAccount.setDescription("Savings account");
		
		Account createdAccount = accountService.createNewAccount(newAccount);
		assertThat(createdAccount, isA(Account.class));
		assertEquals(newAccount.getName(), createdAccount.getName());
	}

	@Test
	public void testUpdateAccount() {
		//fail("Not yet implemented");
		// assume old account is fetched already or is mocked
		Account oldAccount = new Account();
		oldAccount.setName("Henry Long");
		String oldName = oldAccount.getName();
		
		Account updatedAccount = accountService.updateAccount(oldAccount);
		assertThat(updatedAccount, isA(Account.class));
		// name would have been updated by the account service, so it should be different now.
		assertNotEquals(oldName, updatedAccount.getName());
	}

	@Test
	public void testDeleteAccount() {
		//fail("Not yet implemented");
		// assume old account is fetched already or is mocked
		Account oldAccount = new Account();
		oldAccount.setName("Henry Long");
		boolean result = accountService.deleteAccount(oldAccount);
		assertTrue(result);
	}

	@Test
	public void testListTransactions() {
		//fail("Not yet implemented");
		// assume old account is fetched already or is mocked
		Account oldAccount = new Account();
		oldAccount.setName("Henry Long");
		
		List<Transaction> transactions = accountService.listTransactions(oldAccount);
		assertTrue(transactions.size() > 0);
	}

}
