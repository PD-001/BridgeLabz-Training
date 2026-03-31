package collections.mapinterface;

import java.util.HashMap;
import java.util.ArrayList;

public class InvertMap {

	//method to invert map
	public static HashMap<Integer,ArrayList<String>> invert(HashMap<String,Integer> map) {

		HashMap<Integer,ArrayList<String>> invertedMap= new HashMap<>();

		for (String key: map.keySet()) {

			int value= map.get(key);

			if (!invertedMap.containsKey(value)) {
				invertedMap.put(value,new ArrayList<>());
			}

			invertedMap.get(value).add(key);
		}

		return invertedMap;
	}

	public static void main(String[] args) {

		HashMap<String,Integer> map= new HashMap<>();
		map.put("A",1);
		map.put("B",2);
		map.put("C",1);

		HashMap<Integer,ArrayList<String>> result= invert(map);

		System.out.println(result);
	}
}
