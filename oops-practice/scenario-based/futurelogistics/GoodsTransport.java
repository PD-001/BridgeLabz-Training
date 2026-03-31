package futurelogistics;

abstract public class GoodsTransport {
	
	private String transportId;
	private String transportDate;
	private int transportRating;
	
	public GoodsTransport(String transportId, String transportDate, int transportRatting) {
		this.transportId= transportId;
		this.transportDate= transportDate;
		this.transportRating= transportRatting;
	}
	
	public String getTransportId() {
		return transportId;
	}

	public void setTransportId(String transportId) {
		this.transportId = transportId;
	}

	public String getTransportDate() {
		return transportDate;
	}

	public void setTransportDate(String transportDate) {
		this.transportDate = transportDate;
	}

	public int getTransportRating() {
		return transportRating;
	}

	public void setTransportRating(int transportRating) {
		this.transportRating = transportRating;
	}

	abstract public String vehicleSelection();
	
	abstract public float calculateTotalCharge();
	
	@Override
	public String toString() {
		return "Tranporter id : "+ getTransportId() +
				"\nDate of transport : "+ getTransportDate() +
				"\nRating of the transport : "+ getTransportRating();
	}
	
}
