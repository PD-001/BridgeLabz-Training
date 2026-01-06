package collections.listinterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {

	//method to reverse an ArrayList
	public static List<Integer> reverseArrayList(List<Integer> list) {

		List<Integer> reversedList= new ArrayList<>();

		for (int i=list.size()-1;i>=0;i--) {
			reversedList.add(list.get(i));
		}

		return reversedList;
	}

	//method to reverse a LinkedList
	public static List<Integer> reverseLinkedList(List<Integer> list) {

		List<Integer> reversedList= new LinkedList<>();

		for (int i=list.size()-1;i>=0;i--) {
			reversedList.add(list.get(i));
		}

		return reversedList;
	}

	public static void main(String[] args) {

		List<Integer> arrayList= new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);

		System.out.println("Original ArrayList: "+arrayList);
		System.out.println("Reversed ArrayList: "+reverseArrayList(arrayList));

		List<Integer> linkedList= new LinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);

		System.out.println("Original LinkedList: "+linkedList);
		System.out.println("Reversed LinkedList: "+reverseLinkedList(linkedList));
	}
}
