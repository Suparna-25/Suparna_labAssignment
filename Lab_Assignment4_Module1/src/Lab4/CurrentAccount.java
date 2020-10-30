/**
 * Desc: This class holds all operations related to a person's current bank account
 * @ author-Suparna Arya
 */
package Lab4;

public class CurrentAccount extends Account {
	public CurrentAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	/*
	 * This methods overrides withdraw operation of account 
	 */
	void withdraw(double amount) {
		final double overdraftLimit = 800;
		if (amount >= overdraftLimit) {
			setBalance(getBalance() - amount);
		}
	}
}
