package functionalinterfaces.staticmethodinintefaces.dataformatutility;

import java.time.*;
import java.time.format.DateTimeFormatter;

public interface FormatDates {
	
	public static String formatDate(LocalDate date) {
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
		return date.format(formatter);
	}
	
}
