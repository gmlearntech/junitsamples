/**
 * 
 */
package com.gmsingh.learning.junit;

import java.util.List;

/**
 * @author gmsingh
 *
 */
public interface AccountService {
	public Account createNewAccount(Account act);
	public Account updateAccount(Account act);
	public boolean deleteAccount(Account act);
	public List<Transaction> listTransactions(Account act);
}
