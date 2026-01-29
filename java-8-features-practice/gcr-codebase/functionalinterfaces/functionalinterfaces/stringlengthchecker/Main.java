package functionalinterfaces.functionalinterfaces.stringlengthchecker;

import java.util.function.Function;

public class Main {
	public static void main(String[] args) {
		
		String message= "Hello this is a message";
		
		Function<String, Integer> calLength=  (m) -> m.length();
		
		int limit= 30;
		
		int mssglength= calLength.apply(message);
		
		if(mssglength>limit) {
			System.out.println("Message exceeds character limit");
		}
		else {
			System.out.println("Message is within limits of charachter limit");
		}
		
	}
}
