package thread.bankingsystemwithmultipletransactions;

public class BankAccount {

	private double balance;
	
	public BankAccount() {
		balance=10000;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public synchronized boolean withdraw(double amount) {
		
		if(balance<amount) {
			return false;
		}
		
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			System.out.println("Interrupted: "+ e.getMessage());
		}
		
		balance-=amount;
		return true;
		
	}
	
}
