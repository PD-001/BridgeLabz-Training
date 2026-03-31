package collections.listinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfElements {

	//method to find frequency of elements in a list
	public static Map<String,Integer> findFrequency(List<String> list) {

		Map<String,Integer> frequencyMap= new HashMap<>();

		for (int i=0;i<list.size();i++) {
			String key= list.get(i);

			if (frequencyMap.containsKey(key)) {
				frequencyMap.put(key,frequencyMap.get(key)+1);
			}
			else {
				frequencyMap.put(key,1);
			}
		}

		return frequencyMap;
	}

	public static void main(String[] args) {

		List<String> fruits= new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("orange");

		Map<String,Integer> frequency= findFrequency(fruits);

		System.out.println("Frequency Map: "+frequency);
	}
}
