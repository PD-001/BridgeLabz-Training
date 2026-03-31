package oceanfleet;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VesselUtil {
	
	private List<Vessel> vesselList= new ArrayList<Vessel>();
	
	public List<Vessel> getVesselList() {
		return vesselList;
	}
	
	public void setVesselList(List<Vessel> vesselList) {
		this.vesselList = vesselList;
	}
	
	public void addVesselPerformance(Vessel vessel) {
		vesselList.add(vessel);
	}

	
	public Vessel getVesselById(String vesselId) {
		
//		for(int i=0;i<vesselList.size();i++) {
//			
//			if(vesselList.get(i).getVesselId().equalsIgnoreCase(vesselId)) {
//				return vesselList.get(i);
//			}
//			
//		}
//		
//		return null;
		
		return vesselList.stream()
				.filter(v->v.getVesselId().equals(vesselId))
				.findFirst()
				.orElse(null);
		
	}
	
	public List<Vessel> getHighPerformanceVessels(){
		
		double maxSpeed= vesselList.stream()
							.mapToDouble(Vessel::getAverageSpeed)
							.max()
							.orElse(0.0);
		
		return vesselList.stream()
				.filter(v->v.getAverageSpeed()==maxSpeed)
				.collect(Collectors.toList());
		
	}
	
}
