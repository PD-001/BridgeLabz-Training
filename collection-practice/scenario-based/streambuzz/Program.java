package streambuzz;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;


public class Program {

	public void RegisterCreator(CreatorStats record) {
		CreatorStats.engagementBoard.add(record);
	}
	
	public Dictionary<String, Integer> GetTopPostCounts(List<CreatorStats> records, double likeThreshold){
		
		Dictionary<String, Integer> topPostCount= new Hashtable<>();
		
		for(CreatorStats record: records) {
			int count=0;
			for(int i=0;i<record.weeklyLikes.length;i++) {
				if(record.weeklyLikes[i]>= likeThreshold) {
					count++;
				}
			}
			if(count>0) {
				topPostCount.put(record.creatorName, count);
			}
		}
		
//		if(topPostCount.isEmpty()) {
//			topPostCount.put(null, null);
//		}
		
		return topPostCount;
	}
	
	public double CalculateAverageLikes() {
		double grandAvg=0;
		
		for(CreatorStats record: CreatorStats.engagementBoard) {
			int avg=0;
			for(double week: record.weeklyLikes) {
				avg+=week;
			}
			avg/=record.weeklyLikes.length;
			grandAvg+=avg;
		}
		
		return grandAvg/(CreatorStats.engagementBoard.size());
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		Program p= new Program();
		
		int choice=0;
		
		do {
			System.out.println("1. Register Creator");
			System.out.println("2. Show Top Posts");
			System.out.println("3. Calculate Average Likes");
			System.out.println("4. Exit");
			
			System.out.println("Enter your choice:");
			
			choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
				case 1:
					System.out.println("Enter Creator Name:");
					String name= sc.nextLine();
					
					System.out.println("Enter weekly likes (Week 1 to 4):");
					double[] likes= new double[4];
					for(int i=0;i<likes.length;i++) likes[i]=sc.nextDouble();
					
					p.RegisterCreator(new CreatorStats(name, likes));
					
					System.out.println("Creator registered successfully");
					break;
					
				case 2:
					System.out.println("Enter like threshold:");
					double threshold= sc.nextDouble();
					
					Dictionary<String, Integer> topPostCount= p.GetTopPostCounts(CreatorStats.engagementBoard, threshold);
					
					if(topPostCount.isEmpty()) {
						System.out.println("No top-performing posts this week");
						break;
					}
					
					Enumeration<String> creators= topPostCount.keys();
					
					while(creators.hasMoreElements()) {
						String key= creators.nextElement();
						Integer value= topPostCount.get(key);
						
						System.out.println(key +"-"+ value);
					}
					break;
					
				case 3:
					System.out.println("Overall average weekly likes: "+ p.CalculateAverageLikes());
					break;
					
				case 4:
					System.out.println("Logging off - Keep Creating with StreamBuzz!");
					break;
					
				default:
					System.out.println("Please enter valid choice.");
					break;
			}
			
		}
		while(choice!=4);
		
		sc.close();
		
	}
	
}
