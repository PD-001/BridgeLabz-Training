
import java.util.Scanner;

public class YoungestFriend {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("input heights");
		int amarHeight= sc.nextInt();
		int akbarHeight= sc.nextInt();
		int anthonyHeight= sc.nextInt();
		System.out.println("input ages");
		int amarAge= sc.nextInt();
		int akbarAge= sc.nextInt();
		int anthonyAge= sc.nextInt();
		
        //checking tallest and printing the name
		if(amarHeight>akbarHeight && amarHeight>anthonyHeight) {
			System.out.println("Amar is the tallest.");
		}
		else if(akbarHeight>anthonyHeight) {
			System.out.println("Akbar is the tallest.");
		}
		else {
			System.out.println("Anthony is the tallest.");
		}
		//checking youngest and printing the name
		if(amarAge<akbarAge && amarAge<anthonyAge) {
			System.out.println("Amar is the youngest.");
		}
		else if(akbarAge<anthonyAge) {
			System.out.println("Akbar is the youngest.");
		}
		else {
			System.out.println("Anthony is the youngest.");
		}
		
		sc.close();
		
	}
}
