package Lab4;

public class SavingsAccount extends Account {
	public SavingsAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	void withdraw(double amount) {
		final double minimumBalance = 1000;
		if (amount >= minimumBalance) {
			setBalance(getBalance() - amount);
		}
	}
}
