package lambdaexpressions.smarthomelightingautomation;

public class Main {
	public static void main(String[] args) {
		Light motion= (trigger)->System.out.println("Light patter 1 due to:" + trigger);
		Light timeOfDay= (trigger)->System.out.println("Light patter 2 due to:" + trigger);
		Light voice= (trigger)->System.out.println("Light patter 2 due to:" + trigger);
		
		motion.trigger("Motion");
		timeOfDay.trigger("Time of day");
		voice.trigger("Voice");
	}
}
