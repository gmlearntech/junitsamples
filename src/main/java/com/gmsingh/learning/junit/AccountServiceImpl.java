package com.gmsingh.learning.junit;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {

	public Account createNewAccount(Account act) {
		// dummy impl - add the account to the DB
		return act;
	}

	public Account updateAccount(Account act) {
		// dummy impl - change the name of the account and add to the DB
		act.setName("Henry updated");
		return act;
	}

	public boolean deleteAccount(Account act) {
		// dummy impl - remove the account from DB
		return true;
	}

	public List<Transaction> listTransactions(Account act) {
		Transaction newTrans = new Transaction();
		newTrans.setId(1);
		List<Transaction> transactions = new ArrayList<>();
		transactions.add(newTrans);
		return transactions;
	}

}
