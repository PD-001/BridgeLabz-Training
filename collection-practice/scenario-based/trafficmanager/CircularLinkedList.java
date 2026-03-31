package trafficmanager;

class Node {
	Node next;
	Vehicle value;
	Node(Vehicle value){
		this.next= null;
		this.value= value;
	}
}

public class CircularLinkedList {
	Node head=null;
	
	public void insert(Vehicle value) {
		Node newNode= new Node(value);
		if(head== null) {
			head= newNode;
			head.next=head;
			return;
		}
		Node temp= head;
		while(temp.next!=head) {
			temp=temp.next;
		}
		temp.next=newNode;
		newNode.next=head;
	}
	
	public void deleteByValue(Vehicle value) {
		if(head==null) {
			System.out.println("No vehicles in roundabout");
			return;
		}

		if(head.next==head && head.value.vehicleNumber.equals(value.vehicleNumber)) {
			head= null;
			return;
		}

		Node temp= head;

		if(head.value.vehicleNumber.equals(value.vehicleNumber)) {
			while(temp.next != head) {
				temp = temp.next;
			}
			temp.next = head.next;
			head = head.next;
			return;
		}

		while(temp.next!= head && !temp.next.value.vehicleNumber.equals(value.vehicleNumber)) {
			temp = temp.next;
		}

		if(temp.next!= head) {
			temp.next= temp.next.next;
		}
		else {
			System.out.println("Vehicle not found in roundabout");
		}
	}
	
	public int size() {
		if(head==null) {
			return 0;
		}
		Node temp=head;
		int c=1;
		while(temp.next!=head) {
			temp=temp.next;
			c++;
		}
		return c;
	}
}
