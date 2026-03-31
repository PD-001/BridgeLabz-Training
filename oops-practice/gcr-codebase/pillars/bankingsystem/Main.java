package bankingsystem;

public class Main {
	public static void main(String[] args) {
		BankAccount[] accounts= {
				new SavingsAccount("SAV123", "Alice", 10000),
				new CurrentAccount("CUR456", "Bob", 20000)
		};

		for (BankAccount account:accounts) {
			System.out.println("Account Holder: "+ account.getHolderName());
			System.out.println("Account Number: "+ account.getAccountNumber());
			System.out.println("Balance: ₹"+ account.getBalance());

			double interest= account.calculateInterest();
			System.out.println("Calculated Interest: ₹"+ interest);

			account.deposit(5000);
			account.withdraw(2000);

			if (account instanceof Loanable) {
				Loanable loanAccount= (Loanable) account;
				double eligibility= loanAccount.calculateLoanEligibility();
				System.out.println("Loan Eligibility: ₹"+ eligibility);
				loanAccount.applyForLoan(50000);
			}

			System.out.println();
		}
	}
}