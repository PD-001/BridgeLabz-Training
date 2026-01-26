package lambdaexpressions.notificationfiltering;

public class HospitalAlerts {
	
	int alertType;
	String alertTitle;
	String alertDesc;
	
	HospitalAlerts(int alertType, String alertTitle, String alertDesc){
		this.alertType= alertType;
		this.alertTitle= alertTitle;
		this.alertDesc= alertDesc;
	}
	
	@Override
	public String toString() {
		return "AlertType:"+ this.alertType +"\nAlertTitle:"+ this.alertTitle +"\nAlertDesc:"+ this.alertDesc +"\n";
	}
}
