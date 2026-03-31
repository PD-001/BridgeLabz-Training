package bankingsystem;

class SavingsAccount extends BankAccount implements Loanable {
	private static final double INTEREST_RATE= 0.04; //4% annual

	public SavingsAccount(String accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
	}

	@Override
	public double calculateInterest() {
		return getBalance()*INTEREST_RATE;
	}

	@Override
	public void applyForLoan(double amount) {
		System.out.println("Loan of ₹"+ amount +" applied successfully for Savings Account.");
	}

	@Override
	public double calculateLoanEligibility() {
		return getBalance()*2; //eligibility = 2 times the balance
	}
}