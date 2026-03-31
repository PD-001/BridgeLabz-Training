package thread.bankingsystemwithmultipletransactions;

import java.time.LocalDateTime;

public class Transaction implements Runnable{

	private String customerName;
	private BankAccount account;
	private int amount;
	
	public Transaction( BankAccount account, String customerName, int amount) {
		super();
		this.customerName= customerName;
		this.account= account;
		this.amount= amount;
	}
		
	@Override
	public void run() {
		
		 System.out.println("["+ Thread.currentThread().getName() +"] State: "+ Thread.currentThread().getState());

		 System.out.println("["+ customerName +"] Attempting to withdraw "+ amount);

		 boolean success= account.withdraw(amount);

		 if (success)
		 {
			 System.out.println("Transaction successful: "+ customerName
					 +", Amount: "+ amount
					 +", Balance: " +account.getBalance()
					 +", Time: " +LocalDateTime.now());
		 }
		 else
		 {
			 System.out.println("Transaction failed: "
					 +customerName
					 +", Amount: "+ amount
					 +", Time: "+ LocalDateTime.now());
		 }
		
	}
	
}
