package lambdaexpressions.notificationfiltering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		List<HospitalAlerts> alerts= new ArrayList<>();
		
		alerts.add(new HospitalAlerts(1, "Critical:Leakage", "Leakage of harmful gases in area around factory.Stay inddors"));
		alerts.add(new HospitalAlerts(2, "Air Pollution", "Currrent aqi:150, caution advised"));
		alerts.add(new HospitalAlerts(3, "Exercise Daily", "Health is a marathon"));
		
		Predicate<HospitalAlerts> choice= (alert)->alert.alertType<=2;
		
		System.out.println(Arrays.toString(alerts.stream().filter(choice).toArray()));
	}
}
