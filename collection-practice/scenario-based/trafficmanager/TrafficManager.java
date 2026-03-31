package trafficmanager;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class TrafficManager {
	final static int maxForRoundabout=10;
	final static int maxForQueue=10;
	
	CircularLinkedList roundabout= new CircularLinkedList();
	Queue<Vehicle> queue= new LinkedList<>();
	
	public void vehiclesForRoundabout(LinkedList<String> vehicles) {
		for(String vehicle:vehicles) {
			Vehicle v= convertToVehicleObj(vehicle);
			if(queue.size() < maxForQueue) {
				queue.offer(v);
			}
			else {
				System.out.println("Queue overflow. Vehicle "+vehicle+" cannot enter.");
			}
			reduceTimeOfVehiclesInRoundabout();
			addIfNotFull();
		}
	}
	
	public void addIfNotFull() {
		while(roundabout.size() < maxForRoundabout && !queue.isEmpty()) {
			roundabout.insert(queue.poll());
		}
	}
	
	public void reduceTimeOfVehiclesInRoundabout() {
		if(roundabout.head==null) {
			return;
		}

		Node current= roundabout.head;

		do {
			current.value.remainingTimeInRoundabout--;

			if(current.value.remainingTimeInRoundabout==0) {
				Vehicle toRemove= current.value;
				current= current.next;
				roundabout.deleteByValue(toRemove);
				if(roundabout.head==null) {
					return;
				}
			}
			else {
				current= current.next;
			}
		}
		while(current!= roundabout.head);
	}
	
	public void vehiclesInRoundAbout() {
		if(roundabout.head==null) {
			System.out.println("No vehicles in roundabout");
			return;
		}
		Node current=roundabout.head;
		int c=1;
		while(current.next!=roundabout.head){
			System.out.println(c +":\nVehicle Number:"+ current.value.vehicleNumber +"\n Remaining time in roundabout:"+ current.value.remainingTimeInRoundabout);
			c++;
			current=current.next;
		}
	}
	
	public Vehicle convertToVehicleObj(String vehicle) {
		Random random= new Random();
		return new Vehicle(vehicle,random.nextInt(10-0+1));
	}
}
