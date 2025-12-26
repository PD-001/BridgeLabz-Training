package bankingsystem;

abstract class BankAccount {
	private String accountNumber;
	private String holderName;
	private double balance;

	public BankAccount(String accountNumber, String holderName, double balance) {
		this.accountNumber= accountNumber;
		this.holderName= holderName;
		this.balance= balance;
	}

	//encapsulation: Getters & Setters
	public String getAccountNumber() {
		return accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public double getBalance() {
		return balance;
	}

	protected void setBalance(double balance) {
		this.balance= balance;
	}

	//concrete Methods
	public void deposit(double amount) {
		if (amount>0) {
			balance+=amount;
			System.out.println("₹"+ amount +" deposited successfully.");
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	public void withdraw(double amount) {
		if (amount>0 && amount<=balance) {
			balance-=amount;
			System.out.println("₹"+ amount +" withdrawn successfully.");
		} else {
			System.out.println("Invalid or insufficient funds for withdrawal.");
		}
	}

	//abstract Method
	public abstract double calculateInterest();
}