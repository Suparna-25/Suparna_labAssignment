package Lab4;

public class CurrentAccount extends Account {
	public CurrentAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	void withdraw(double amount) {
		final double overdraftLimit = 800;
		if (amount >= overdraftLimit) {
			setBalance(getBalance() - amount);
		}
	}
}
