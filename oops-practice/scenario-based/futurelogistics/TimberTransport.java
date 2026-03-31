package futurelogistics;

public class TimberTransport extends GoodsTransport{
	
	private float timberLength;
	private float timberRadius;
	private String timberType;
	private float timberPrice;

	public TimberTransport(String input) {
		super(input.trim().split("\\:")[0], input.trim().split("\\:")[1], Integer.parseInt(input.trim().split("\\:")[2]));
		String[] values= input.trim().split("\\:");
		this.timberLength= Float.parseFloat(values[3]);
		this.timberRadius= Float.parseFloat(values[4]);
		this.timberType= values[5];
		this.timberPrice= Float.parseFloat(values[6]);
	}
	
	public float getTimberLength() {
		return timberLength;
	}
	public void setTimberLength(float timberLength) {
		this.timberLength = timberLength;
	}
	public float getTimberRadius() {
		return timberRadius;
	}
	public void setTimberRadius(float timberRadius) {
		this.timberRadius = timberRadius;
	}
	public String getTimberType() {
		return timberType;
	}
	public void setTimberType(String timberType) {
		this.timberType = timberType;
	}
	public float getTimberPrice() {
		return timberPrice;
	}
	public void setTimberPrice(float timberPrice) {
		this.timberPrice = timberPrice;
	}
	
	@Override
	public String vehicleSelection() {
		float timberArea= 2 * (float)3.147 * timberLength * timberRadius;
		
		if(timberArea<250) return "Truck";
		else if(timberArea>=250 && timberArea<=400) return "Lorry";
		else return "MonsterLorry";
	}
	
	@Override
	public float calculateTotalCharge() {
		float volume= (float)3.147 * timberRadius * timberRadius * timberLength;
		
		String vehicle= vehicleSelection();
		int vehiclePrice= 0;
		if(vehicle.equalsIgnoreCase("Truck")) vehiclePrice= 1000;
		else if(vehicle.equalsIgnoreCase("Lorry")) vehiclePrice= 1700;
		else vehiclePrice= 3000;
		
		float totalBasePrice=0;
		if(timberType.equalsIgnoreCase("Premium")) {
			totalBasePrice= volume * timberPrice * (float)0.25;
		}else {
			totalBasePrice= volume * timberPrice * (float)0.15;
		}
		
		float tax= totalBasePrice * (float)0.3;
		
		int discountPercent= 0;
		if(getTransportRating()==5) discountPercent= 20;
		else if(getTransportRating()==3 || getTransportRating()==4) discountPercent= 10;
		else if(getTransportRating()==1 || getTransportRating()==2) discountPercent= 0;
		
		float discount= totalBasePrice * ((float)discountPercent/100);
		
		float totalCharge= (totalBasePrice + vehiclePrice + tax) - discount;
		
		return totalCharge;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nType of timber : "+ getTimberType() +
				"\nTimber price per kilo : "+ getTimberPrice() +
				"\nVehicle for transport : "+ vehicleSelection() +
				"\nTotal Charge : "+ calculateTotalCharge();
	}
}
