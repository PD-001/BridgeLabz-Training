package streamapi.insuranceclaimanalysis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Claim{
	
	private int type;
	private double amount;
	
	public Claim(int type, double amount) {
		this.setType(type);
		this.setAmount(amount);
	}

	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type= type;
	}

	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount= amount;
	}
	
}

public class Main {
	public static void main(String[] args) {
		List<Claim> claims= new ArrayList<>(
				Arrays.asList(
							new Claim(1,2000f),
							new Claim(2,3000f),
							new Claim(1,2000f),
							new Claim(2,4000f),
							new Claim(1,6000f),
							new Claim(2,20000f),
							new Claim(2,200f)
						)
				);
		
		claims.stream()
			.collect(Collectors.groupingBy(Claim::getType
					,Collectors.averagingDouble(Claim::getAmount)
					)).forEach((type,avg)->System.out.println("Claim type: "+ type +" -Avg amount: "+ avg));
	}
}
