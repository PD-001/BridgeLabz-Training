package collectors.wordfrequencycounter;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		String para= "This is a this para";
		
		Map<String, Integer> wordCount= 
			Arrays.stream(para.split(" "))
				.collect(Collectors.toMap(w->w.toLowerCase(), w->1, Integer::sum));
		
		System.out.println(wordCount);
	}
}
