package futurelogistics;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {
	
	public GoodsTransport parseDetails(String input) throws TerminateProgram {
		String[] values= input.trim().split("\\:");
		validateTransportId(values[0]);
		if(values[3].equalsIgnoreCase("bricktransport")) {
			List<String> inputForBrickTransport= new ArrayList<>();
			
			for(int i=0;i<values.length;i++) {
				if(i!=3)
				inputForBrickTransport.add(values[i]);
			}
			
			return new BrickTransport(String.join(":", inputForBrickTransport));
		}
		else {
			List<String> inputForBrickTransport= new ArrayList<>();
			
			for(int i=0;i<values.length;i++) {
				if(i!=3)
				inputForBrickTransport.add(values[i]);
			}
			
			return new TimberTransport(String.join(":", inputForBrickTransport));
		}
	}
	
	public boolean validateTransportId(String transportId) throws TerminateProgram {
		
		Matcher matcher= Pattern.compile("^RTS[0-9]{3}[A-Z]$").matcher(transportId);
		
		if(matcher.matches()) {
			return true;
		}
		else {
			System.out.println("Transport id "+ transportId +" is invalid");
			System.out.println("Please provide a valid record");
			throw new TerminateProgram("Program Terminated");
		}
	}
	
	public String findObjectType(GoodsTransport goodsTransport) {
		if(goodsTransport instanceof BrickTransport) return "BrickTransport";
		else return "TimberTransport";
	}
	
}
