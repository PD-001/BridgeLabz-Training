package m1practiceproblem.outside.set3.railwayseatallocation;

import java.util.*;

class Booking {
	
	String passengerId;
	int seats;
	double fare;
	
	public Booking(String passengerId, int seats, double fare) {
		this.passengerId= passengerId;
		this.seats= seats;
		this.fare= fare;
	}
}

class Train {
	
	String trainId;
	String source;
	String destination;
	int totalSeats;
	int available;
	double baseFare;
	ArrayList<Booking> list;
	
	public Train(String trainId, String source, String destination,
			int totalSeats, double baseFare) {
		
		this.trainId= trainId;
		this.source= source;
		this.destination= destination;
		this.totalSeats= totalSeats;
		this.available= totalSeats;
		this.baseFare= baseFare;
		this.list= new ArrayList<>();
	}
}

public class Main {
	
	static ArrayList<Train> trains= new ArrayList<>();
	
	public static void addTrain(String trainId, String source,
			String destination, int totalSeats, double baseFare) {
		
		for(Train t: trains) {
			if(t.trainId.equalsIgnoreCase(trainId)) return;
		}
		
		trains.add(new Train(trainId, source, destination, totalSeats, baseFare));
	}
	
	public static void bookSeats(String trainId, String passengerId, int seatCount) {
		
		for(Train t: trains) {
			
			if(t.trainId.equalsIgnoreCase(trainId)) {
				
				if(seatCount>t.available) {
					System.out.println("Booking failed");
					return;
				}
				
				double fare= (seatCount * t.baseFare) + (seatCount * 25);
				
				t.available-= seatCount;
				
				t.list.add(new Booking(passengerId, seatCount, fare));
				
				System.out.println("BOOKED "+trainId+" "+passengerId+" "+(int)fare);
				return;
			}
		}
		
		System.out.println("Booking failed");
	}
	
	public static void cancelBooking(String trainId, String passengerId) {
		
		for(Train t: trains) {
			
			if(t.trainId.equalsIgnoreCase(trainId)) {
				
				Iterator<Booking> it= t.list.iterator();
				
				while(it.hasNext()) {
					
					Booking b= it.next();
					
					if(b.passengerId.equalsIgnoreCase(passengerId)) {
						
						t.available+= b.seats;
						it.remove();
						
						System.out.println("CANCELLED "+trainId+" "+passengerId);
						return;
					}
				}
				
				System.out.println("Cancellation failed");
				return;
			}
		}
		
		System.out.println("Cancellation failed");
	}
	
	public static void findRoute(String source, String destination) {
		
		boolean found=false;
		
		for(Train t: trains) {
			
			if(t.source.equalsIgnoreCase(source) &&
			   t.destination.equalsIgnoreCase(destination)) {
				
				System.out.println(t.trainId+" "+t.available);
				found=true;
			}
		}
		
		if(!found) {
			System.out.println("No trains available");
		}
	}
	
	public static void summary() {
		
		boolean any=false;
		
		for(Train t: trains) {
			
			double sum=0;
			
			for(Booking b: t.list) {
				sum+= b.fare;
			}
			
			if(sum>0) any=true;
			
			System.out.println(t.trainId+" "+(int)sum);
		}
		
		if(!any) {
			System.out.println("No revenue generated");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		sc.nextLine();
		
		while(n-- > 0) {
			
			String line= sc.nextLine();
			
			if(line.trim().length()==0) continue;
			
			String[] strArray= line.split("\\s+");
			
			if(strArray[0].equalsIgnoreCase("ADDTRAIN")) {
				
				addTrain(strArray[1], strArray[2], strArray[3],
						Integer.parseInt(strArray[4]),
						Double.parseDouble(strArray[5]));
			}
			
			else if(strArray[0].equalsIgnoreCase("BOOK")) {
				
				bookSeats(strArray[1], strArray[2],
						Integer.parseInt(strArray[3]));
			}
			
			else if(strArray[0].equalsIgnoreCase("CANCEL")) {
				
				cancelBooking(strArray[1], strArray[2]);
			}
			
			else if(strArray[0].equalsIgnoreCase("ROUTE")) {
				
				findRoute(strArray[1], strArray[2]);
			}
			
			else {
				
				summary();
			}
		}
	}
}