package collections.setinterface;
package collections;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {

	//method to find union of two sets
	public static Set<Integer> findUnion(Set<Integer> set1,Set<Integer> set2) {

		Set<Integer> union= new HashSet<>(set1);
		union.addAll(set2);

		return union;
	}

	//method to find intersection of two sets
	public static Set<Integer> findIntersection(Set<Integer> set1,Set<Integer> set2) {

		Set<Integer> intersection= new HashSet<>(set1);
		intersection.retainAll(set2);

		return intersection;
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

		System.out.println("Union: "+findUnion(set1,set2));
		System.out.println("Intersection: "+findIntersection(set1,set2));
	}
}
