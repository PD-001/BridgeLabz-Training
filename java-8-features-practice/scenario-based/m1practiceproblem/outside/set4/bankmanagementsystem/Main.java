package m1practiceproblem.outside.set4.bankmanagementsystem;

import java.util.*;

abstract class Account {
	
	String accNo;
	String name;
	double balance;
	
	public Account(String accNo, String name, double balance) {
		this.accNo= accNo;
		this.name= name;
		this.balance= balance;
	}
	
	public void deposit(int amount) {
		balance+= amount;
		System.out.println("Deposited Successfully");
	}
	
	abstract void withdraw(int amount);
}

class SavingsAccount extends Account {
	
	public SavingsAccount(String accNo, String name, double balance) {
		super(accNo, name, balance);
	}
	
	void withdraw(int amount) {
		
		double total= amount + 2;
		
		if(balance - total < 0) {
			System.out.println("Insufficient Funds");
			return;
		}
		
		balance-= total;
		System.out.println("Withdrawal Successful");
	}
}

class CurrentAccount extends Account {
	
	public CurrentAccount(String accNo, String name, double balance) {
		super(accNo, name, balance);
	}
	
	void withdraw(int amount) {
		
		double total= amount + 5;
		
		if(balance - total < -10000) {
			System.out.println("Insufficient Funds");
			return;
		}
		
		balance-= total;
		System.out.println("Withdrawal Successful");
	}
}

class BusinessAccount extends Account {
	
	public BusinessAccount(String accNo, String name, double balance) {
		super(accNo, name, balance);
	}
	
	void withdraw(int amount) {
		
		double charge= amount * 0.01;
		double total= amount + charge;
		
		if(balance - total < -50000) {
			System.out.println("Insufficient Funds");
			return;
		}
		
		balance-= total;
		System.out.println("Withdrawal Successful");
	}
}

public class Main {
	
	static ArrayList<Account> list= new ArrayList<>();
	
	public static void createAccount(String accNo, String name,
			String type, int balance) {
		
		Account a= null;
		
		if(type.equalsIgnoreCase("SavingsAccount")) {
			a= new SavingsAccount(accNo, name, balance);
		}
		
		else if(type.equalsIgnoreCase("CurrentAccount")) {
			a= new CurrentAccount(accNo, name, balance);
		}
		
		else {
			a= new BusinessAccount(accNo, name, balance);
		}
		
		list.add(a);
		System.out.println("Account Created: "+accNo);
	}
	
	public static Account find(String accNo) {
		
		for(Account a: list) {
			if(a.accNo.equalsIgnoreCase(accNo)) return a;
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		sc.nextLine();
		
		while(n-- > 0) {
			
			String line= sc.nextLine();
			String[] strArray= line.split("\\s+");
			
			if(strArray[0].equalsIgnoreCase("Create")) {
				
				createAccount(strArray[1], strArray[2],
						strArray[3], Integer.parseInt(strArray[4]));
			}
			
			else if(strArray[0].equalsIgnoreCase("Deposit")) {
				
				Account a= find(strArray[1]);
				
				if(a==null) {
					System.out.println("Account Not Found");
				}
				else {
					a.deposit(Integer.parseInt(strArray[2]));
				}
			}
			
			else {
				
				Account a= find(strArray[1]);
				
				if(a==null) {
					System.out.println("Account Not Found");
				}
				else {
					a.withdraw(Integer.parseInt(strArray[2]));
				}
			}
		}
	}
}