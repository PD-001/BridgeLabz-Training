
public class BankAccount {

	//attributes
	private String accountHolder;
	private String accountNumber;
	private double balance;

	//constructor
	public BankAccount(String accountHolder, String accountNumber, double balance) {
		this.accountHolder= accountHolder;
		this.accountNumber= accountNumber;
		this.balance= balance;
	}

	//creating method to display bank name
	public static void displayBank() {
		System.out.println("State of Chennai");
	}

	//creating method to deposit amount
	public void deposit(double amount) {
		if (amount>0) {
			balance+=amount;
			System.out.println("Deposited: "+ amount);
		}
		else {
			System.out.println("Amount to deposit must be positive");
		}
	}

	//creating method to withdraw amount
	public void withdraw(double amount) {
		if (amount>0 && amount<=balance) {
			balance-=amount;
			System.out.println("Withdraw amount is: "+ amount);
		}
		else if (amount<=0) {
			System.out.println("Withdrawal amount must be positive");
		}
		else {
			System.out.println("Insufficient balance");
		}
	}

	// method to display current balance
	public void displayBalance() {
		System.out.println("Current balance: "+ balance);
	}

	public static void main(String[] args) {

		// creating BankAccount object
		BankAccount account= new BankAccount("Pushpak", "123456789", 700.00);

		// displaying bank name
		displayBank();

		// displaying initial balance
		account.displayBalance();

		// depositing money
		account.deposit(200.00);
		account.displayBalance();

		// withdrawing money
		account.withdraw(100.00);
		account.displayBalance();

		// trying to withdraw more than available balance
		account.withdraw(900.00);
	}
}
