
public class BankAccount {

	//public variable
	public String accountNumber;

	//protected variable
	protected String accountHolder;

	//private variable
	private double balance;

	//parameterized constructor
	BankAccount(String accountNumber, String accountHolder, double balance) {
		this.accountNumber= accountNumber;
		this.accountHolder= accountHolder;
		this.balance= balance;
	}

	//public method to access balance
	public double getBalance() {
		return balance;
	}

	//public method to modify balance
	public void setBalance(double balance) {
		this.balance= balance;
	}

	//method to display account details
	public void displayAccount() {
		System.out.println("Account Number: "+ accountNumber);
		System.out.println("Account Holder: "+ accountHolder);
		System.out.println("Balance: "+ balance);
	}

    public class SavingsAccount extends BankAccount {

        //additional attribute
        double interestRate;

        //parameterized constructor
        SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
            super(accountNumber, accountHolder, balance);
            this.interestRate= interestRate;
        }

        //method to display savings account details
        public void displaySavingsAccount() {
            System.out.println("Account Number: "+ accountNumber);//public access
            System.out.println("Account Holder: "+ accountHolder);//protected access
            System.out.println("Balance: "+ getBalance());//private access via getter
            System.out.println("Interest Rate: "+ interestRate);
        }

        
}
    public static void main(String[] args) {

		// creating savings account object
		SavingsAccount savings= new BankAccount("101", "Anita", 25000).new SavingsAccount("1001", "Anita", 25000.00, 4.5);

		// displaying account details
		savings.displaySavingsAccount();

		// modifying balance using setter
		savings.setBalance(30000.00);

		System.out.println("\nAfter Balance Update:");
		savings.displaySavingsAccount();
	}
}
