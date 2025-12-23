package methods;

import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter date (YYYY-MM-DD): ");
		LocalDate date= LocalDate.parse(sc.next());

		//add 7 days, 1 month, and 2 years
		LocalDate result= date.plusDays(7).plusMonths(1).plusYears(2);

		//subtract 3 weeks
		result= result.minusWeeks(3);

		System.out.println("Final Date: "+ result);

		sc.close();
	}
}
