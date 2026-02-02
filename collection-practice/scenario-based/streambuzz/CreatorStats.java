package streambuzz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreatorStats {
	

	private String creatorName;
	private double[] weeklyLikes;
	
	public static List<CreatorStats> engagementBoard= new ArrayList<CreatorStats>();
	
	public CreatorStats(String creatorName, double[] weeklyLikes) {
		this.creatorName= creatorName;
		this.weeklyLikes= weeklyLikes;
	}
	
	public String getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName= creatorName;
	}

	public double[] getWeeklyLikes() {
		return weeklyLikes;
	}

	public void setWeeklyLikes(double[] weeklyLikes) {
		this.weeklyLikes= weeklyLikes;
	}

	@Override
	public String toString() {
		return "CreatorStats Creator Name="+ creatorName +", WeeklyLikes="+ Arrays.toString(weeklyLikes);
	}
	
}
