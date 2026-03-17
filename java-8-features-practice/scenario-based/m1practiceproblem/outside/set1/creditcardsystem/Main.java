package m1practiceproblem.outside.set1.creditcardsystem;

import java.util.*;

class Transaction {
	
	String type;
	int amount;
	int remaining;
	
	public Transaction(String type, int amount, int remaining) {
		this.type= type;
		this.amount= amount;
		this.remaining= remaining;
	}
}

class CreditCard {
	
	String cardNumber;
	String holder;
	int limit;
	int available;
	ArrayList<Transaction> list;
	
	public CreditCard(String cardNumber, String holder, int limit) {
		this.cardNumber= cardNumber;
		this.holder= holder;
		this.limit= limit;
		this.available= limit;
		this.list= new ArrayList<>();
	}
}

public class Main {
	
	static HashMap<String, CreditCard> map= new HashMap<>();
	
	public static void issueCard(String cardNumber, String holder, int limit) {
		
		if(map.containsKey(cardNumber)) return;
		
		CreditCard c= new CreditCard(cardNumber, holder, limit);
		map.put(cardNumber, c);
	}
	
	public static void spendAmount(String cardNumber, int amount) {
		
		if(!map.containsKey(cardNumber)) {
			System.out.println("Transaction declined");
			return;
		}
		
		CreditCard c= map.get(cardNumber);
		
		if(amount>c.available) {
			System.out.println("Transaction declined");
			return;
		}
		
		c.available-=amount;
		
		c.list.add(new Transaction("SPEND", amount, c.available));
		
		System.out.println("SPENT "+cardNumber+" "+c.available);
	}
	
	public static void makePayment(String cardNumber, int amount) {
		
		if(!map.containsKey(cardNumber)) {
			System.out.println("Card not found");
			return;
		}
		
		CreditCard c= map.get(cardNumber);
		
		c.available+=amount;
		
		if(c.available>c.limit) {
			c.available= c.limit;
		}
		
		c.list.add(new Transaction("PAYMENT", amount, c.available));
		
		System.out.println("PAYMENT DONE "+cardNumber+" "+c.available);
	}
	
	public static void getCardsByHolder(String holder) {
		
		ArrayList<CreditCard> temp= new ArrayList<>();
		
		for(CreditCard c: map.values()) {
			if(c.holder.equalsIgnoreCase(holder)) {
				temp.add(c);
			}
		}
		
		if(temp.size()==0) {
			System.out.println("No cards found");
			return;
		}
		
		temp.stream()
			.sorted(Comparator.comparing(c->c.cardNumber))
			.forEach(c->System.out.println(c.cardNumber+" "+c.available));
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		sc.nextLine();
		
		while(n-- > 0) {
			
			String line= sc.nextLine();
			String[] strArray= line.split("\\s+");
			
			if(strArray[0].equalsIgnoreCase("ISSUE")) {
				
				issueCard(strArray[1], strArray[2], Integer.parseInt(strArray[3]));
			}
			
			else if(strArray[0].equalsIgnoreCase("SPEND")) {
				
				spendAmount(strArray[1], Integer.parseInt(strArray[2]));
			}
			
			else if(strArray[0].equalsIgnoreCase("PAYMENT")) {
				
				makePayment(strArray[1], Integer.parseInt(strArray[2]));
			}
			
			else {
				
				getCardsByHolder(strArray[1]);
			}
		}
	}
}