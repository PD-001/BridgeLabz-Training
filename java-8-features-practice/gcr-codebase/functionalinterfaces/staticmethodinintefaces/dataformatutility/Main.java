package functionalinterfaces.staticmethodinintefaces.dataformatutility;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		LocalDate today= LocalDate.now();
		System.out.println(today);
		System.out.println(FormatDates.formatDate(today));
	}
}
