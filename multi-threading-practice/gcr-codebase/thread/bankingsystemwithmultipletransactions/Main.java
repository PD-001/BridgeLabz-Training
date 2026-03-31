package thread.bankingsystemwithmultipletransactions;

public class Main {
	public static void main(String[] args) {
		 BankAccount account= new BankAccount();

		 Thread t1= new Thread(new Transaction(account, "C1", 3000), "T1");
		 Thread t2= new Thread(new Transaction(account, "C2", 4000), "T2");
		 Thread t3= new Thread(new Transaction(account, "C3", 8000), "T3");

		 t1.start();
		 t2.start();
		 t3.start();
	}
}
