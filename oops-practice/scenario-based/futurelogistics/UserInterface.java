package futurelogistics;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Utility utility= new Utility();
		
		
		System.out.println("Enter the Goods Transport details");
		String input= sc.nextLine();
		GoodsTransport newTransport;
		try {			
			newTransport= utility.parseDetails(input);
			System.out.println(newTransport.toString());
		}
		catch(TerminateProgram e) {
		}
		
		sc.close();
	}
}
