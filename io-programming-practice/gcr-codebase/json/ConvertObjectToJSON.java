package json;

import org.json.JSONObject;

class Car {
	String plateNumber;
	String ownerName;
	Car(String plateNumber, String ownerName){
		this.ownerName= ownerName;
		this.plateNumber= plateNumber;
	}
}

public class ConvertObjectToJSON {
	public static void main(String[] args) {
		JSONObject object= new JSONObject();
		Car newCar= new Car("ABC123","Prakash");
		object.put("plate number", newCar.plateNumber);
		object.put("ownerName", newCar.ownerName);
		System.out.println(object);
	}
}
