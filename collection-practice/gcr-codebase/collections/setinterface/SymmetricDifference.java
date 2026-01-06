package collections.setinterface;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {

	//method to find symmetric difference
	public static Set<Integer> findSymmetricDifference(Set<Integer> set1,Set<Integer> set2) {

		Set<Integer> result= new HashSet<>(set1);

		for (Integer element : set2) {
			if (result.contains(element)) {
				result.remove(element);
			}
			else {
				result.add(element);
			}
		}

		return result;
	}

	public static void main(String[] args) {

		Set<Integer> set1= new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);

		Set<Integer> set2= new HashSet<>();
		set2.add(3);
		set2.add(4);
		set2.add(5);

		System.out.println("Symmetric Difference: "+findSymmetricDifference(set1,set2));
	}
}
