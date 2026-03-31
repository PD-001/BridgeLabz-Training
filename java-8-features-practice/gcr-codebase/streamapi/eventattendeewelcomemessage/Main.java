package streamapi.eventattendeewelcomemessage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> attendees= new ArrayList<>(Arrays.asList("Prakash","Pushpak","Anubhav","Sahil","Divanshu"));
		
		attendees.stream().forEach(attendee->System.out.println("Welcome "+ attendee));
		
	}
}
