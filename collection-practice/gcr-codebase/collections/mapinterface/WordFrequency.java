package collections.mapinterface;
package maps;

import java.util.HashMap;

public class WordFrequency {

	//method to count word frequency
	public static HashMap<String,Integer> countFrequency(String text) {

		HashMap<String,Integer> map= new HashMap<>();

		text= text.toLowerCase();
		text= text.replaceAll("[^a-z ]","");

		String[] words= text.split(" ");

		for (int i=0;i<words.length;i++) {

			String word= words[i];

			if (map.containsKey(word)) {
				map.put(word,map.get(word)+1);
			}
			else {
				map.put(word,1);
			}
		}

		return map;
	}

	public static void main(String[] args) {

		String text= "Hello world, hello Java!";

		HashMap<String,Integer> result= countFrequency(text);

		System.out.println(result);
	}
}
