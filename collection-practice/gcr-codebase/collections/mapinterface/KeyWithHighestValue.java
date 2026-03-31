package collections.mapinterface;

import java.util.HashMap;

public class KeyWithHighestValue {

	//method to find key with highest value
	public static String findMaxKey(HashMap<String,Integer> map) {

		String maxKey= null;
		int maxValue= Integer.MIN_VALUE;

		for (String key: map.keySet()) {

			int value= map.get(key);

			if (value>maxValue) {
				maxValue= value;
				maxKey= key;
			}
		}

		return maxKey;
	}

	public static void main(String[] args) {

		HashMap<String,Integer> map= new HashMap<>();
		map.put("A",10);
		map.put("B",20);
		map.put("C",15);

		String result= findMaxKey(map);

		System.out.println("Key with highest value: "+result);
	}
}
