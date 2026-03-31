package m1practiceproblem.set3.eventplanner;

import java.util.*;

abstract class Festival {
	
	String name;
	String location;
	String date;
	
	public Festival(String name, String location, String date) {
		this.name= name;
		this.location= location;
		this.date= date;
	}
	
	abstract void display();
}

class MusicFestival extends Festival {
	
	String headliner;
	String genre;
	int price;
	
	public MusicFestival(String name, String location, String date,
			String headliner, String genre, int price) {
		
		super(name, location, date);
		this.headliner= headliner;
		this.genre= genre;
		this.price= price;
	}
	
	void display() {
		
		System.out.println("Festival Name: "+name);
		System.out.println("Location: "+location);
		System.out.println("Date: "+date);
		System.out.println("Headliner: "+headliner);
		System.out.println("Music Genre: "+genre);
		System.out.println("Ticket Price: "+price);
	}
}

class FoodFestival extends Festival {
	
	String cuisine;
	int stalls;
	int fee;
	
	public FoodFestival(String name, String location, String date,
			String cuisine, int stalls, int fee) {
		
		super(name, location, date);
		this.cuisine= cuisine;
		this.stalls= stalls;
		this.fee= fee;
	}
	
	void display() {
		
		System.out.println("Festival Name: "+name);
		System.out.println("Location: "+location);
		System.out.println("Date: "+date);
		System.out.println("Cuisine: "+cuisine);
		System.out.println("Number of Stalls: "+stalls);
		System.out.println("Entry Fee: "+fee);
	}
}

class ArtFestival extends Festival {
	
	String artType;
	int artists;
	int fee;
	
	public ArtFestival(String name, String location, String date,
			String artType, int artists, int fee) {
		
		super(name, location, date);
		this.artType= artType;
		this.artists= artists;
		this.fee= fee;
	}
	
	void display() {
		
		System.out.println("Festival Name: "+name);
		System.out.println("Location: "+location);
		System.out.println("Date: "+date);
		System.out.println("Art Type: "+artType);
		System.out.println("Number of Artists: "+artists);
		System.out.println("Exhibition Fee: "+fee);
	}
}

public class Main {
	
	static HashMap<String, Festival> map= new HashMap<>();
	
	public static void addFestival(String[] strArray) {
		
		String type= strArray[1];
		
		if(type.equalsIgnoreCase("MUSIC")) {
			
			Festival f= new MusicFestival(
					strArray[2], strArray[3], strArray[4],
					strArray[5], strArray[6],
					Integer.parseInt(strArray[7]));
			
			map.put(strArray[2], f);
		}
		
		else if(type.equalsIgnoreCase("FOOD")) {
			
			Festival f= new FoodFestival(
					strArray[2], strArray[3], strArray[4],
					strArray[5],
					Integer.parseInt(strArray[6]),
					Integer.parseInt(strArray[7]));
			
			map.put(strArray[2], f);
		}
		
		else {
			
			Festival f= new ArtFestival(
					strArray[2], strArray[3], strArray[4],
					strArray[5],
					Integer.parseInt(strArray[6]),
					Integer.parseInt(strArray[7]));
			
			map.put(strArray[2], f);
		}
	}
	
	public static void displayDetails(String name) {
		
		if(!map.containsKey(name)) {
			return;
		}
		
		map.get(name).display();
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			
			String line= sc.nextLine();
			
			if(line.equalsIgnoreCase("EXIT")) break;
			
			String[] strArray= line.split("\\s");
			
			if(strArray[0].equalsIgnoreCase("ADD_FESTIVAL")) {
				addFestival(strArray);
			}
			
			else if(strArray[0].equalsIgnoreCase("DISPLAY_DETAILS")) {
				displayDetails(strArray[1]);
			}
		}
	}
}