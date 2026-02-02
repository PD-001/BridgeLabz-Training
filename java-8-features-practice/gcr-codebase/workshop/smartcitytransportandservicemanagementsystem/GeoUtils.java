package smartcitytransportandservicemanagementsystem;

public interface GeoUtils {
	
	public static double calculateDistance(String startPoint, String endPoint) {
		double start=0;
		double end=0;
		if(startPoint.equalsIgnoreCase("A")) start= 10;
		else if(startPoint.equalsIgnoreCase("B")) start= 20;
		else if(startPoint.equalsIgnoreCase("C")) start= 30;		
		else if(startPoint.equalsIgnoreCase("D")) start= 40;
		else if(startPoint.equalsIgnoreCase("E")) start= 50;
		else start=0;
		
		if(endPoint.equalsIgnoreCase("A")) end= 10;
		else if(endPoint.equalsIgnoreCase("B")) end= 20;
		else if(endPoint.equalsIgnoreCase("C")) end= 30;		
		else if(endPoint.equalsIgnoreCase("D")) end= 40;
		else if(endPoint.equalsIgnoreCase("E")) end= 50;
		else end=100;
		
		return end-start;
		
	}
	
}
