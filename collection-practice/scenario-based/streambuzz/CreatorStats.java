package streambuzz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreatorStats {
	

	public String creatorName;
	public double[] weeklyLikes;
	
	public static List<CreatorStats> engagementBoard= new ArrayList<CreatorStats>();
	
	public CreatorStats(String creatorName, double[] weeklyLikes) {
		this.creatorName= creatorName;
		this.weeklyLikes= weeklyLikes;
	}

	@Override
	public String toString() {
		return "CreatorStats Creator Name="+ creatorName +", WeeklyLikes="+ Arrays.toString(weeklyLikes);
	}
	
}
