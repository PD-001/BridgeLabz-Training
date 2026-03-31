package oceanfleet;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of vessels to be added");
		int noOfVessels= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter vessel details");
		VesselUtil utility= new VesselUtil();
		while(noOfVessels-->0) {
			String input= sc.nextLine();
			String[] values= input.trim().split(":");
			utility.addVesselPerformance(new Vessel(values[0], values[1], Double.parseDouble(values[2]), values[3]));
		}
		
		System.out.println("Enter the Vessel Id to check speed");
		String vesselId=sc.nextLine();
		Vessel checkedVessel= utility.getVesselById(vesselId);
		if(checkedVessel!= null) System.out.println(checkedVessel.toString());
		else System.out.println("Vessel Id "+ vesselId +" not found.");
		
		System.out.println("High performance vessels are");
		utility.getHighPerformanceVessels()
		       .forEach(System.out::println);

		
		
		sc.close();
	}
}
