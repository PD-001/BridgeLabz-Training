package futurelogistics;

public class BrickTransport extends GoodsTransport{
	

	private float brickSize;
	private int brickQuantity;
	private float brickPrice;

	public BrickTransport(String input) {
		
		super(input.trim().split("\\:")[0], input.trim().split("\\:")[1], Integer.parseInt(input.trim().split("\\:")[2]));
		String[] values= input.trim().split("\\:");
		this.brickSize= Float.parseFloat(values[3]);
		this.brickQuantity= Integer.parseInt(values[4]);
		this.brickPrice= Float.parseFloat(values[5]);
	}

	public float getBrickSize() {
		return brickSize;
	}

	public void setBrickSize(float brickSize) {
		this.brickSize = brickSize;
	}
	
	public int getBrickQuatity() {
		return brickQuantity;
	}
	
	public void setBrickQuantiy(int brickQuantity) {
		this.brickQuantity= brickQuantity;
	}
	
	public float getBrickPrice() {
		return brickPrice;
	}
	
	public void setBrickPrice(float brickPrice) {
		this.brickPrice= brickPrice;
	}

	@Override
	public String vehicleSelection() {
		
		if(brickQuantity<300) {
			return "Truck";
		}
		else if (brickQuantity>=300 & brickQuantity<=500) {
			return "Lorry";
		}
		return "MonsterLorry";
	}

	@Override
	public float calculateTotalCharge() {
		float totalBasePrice= brickPrice * brickQuantity;
		
		String vehicle= vehicleSelection();
		
		int vehiclePrice= 0;
		if(vehicle.equalsIgnoreCase("Truck")) vehiclePrice= 1000;
		else if(vehicle.equalsIgnoreCase("Lorry")) vehiclePrice= 1700;
		else vehiclePrice= 3000;

		float tax= totalBasePrice * (float)0.3;
		
		int discountPercent= 0;
		if(getTransportRating()==5) discountPercent= 20;
		else if(getTransportRating()==3 || getTransportRating()==4) discountPercent= 10;
		else if(getTransportRating()==1 || getTransportRating()==2) discountPercent= 0;
		
		float discount= (float)totalBasePrice * ((float)discountPercent/100);
		
		float totalCharge= totalBasePrice + vehiclePrice + tax - discount;
		
		return totalCharge;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nQuantity of bricks : "+ getBrickQuatity() +
				"\nBrick price : "+ getBrickPrice() +
				"\nVehicle for transport : "+ vehicleSelection() +
				"\nTotal Charge : "+ calculateTotalCharge();
	}

}
