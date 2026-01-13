package regexandjunit.junit.testingbankingtransactions;

public class BankAccount {
	private double balance;

	public BankAccount(double initial) {
		this.balance= initial;
	}

	public void deposit(double amount) {
		if (amount>0) {
			balance+=amount;
		}
	}


	public void withdraw(double amount) throws IllegalArgumentException {
		if (amount>balance) {
			throw new IllegalArgumentException("Insufficient funds");
		}
		balance-=amount;
	}


	public double getBalance() {
		return balance;
	}
}
