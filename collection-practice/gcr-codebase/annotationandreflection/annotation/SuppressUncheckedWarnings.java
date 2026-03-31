package annotationandreflection.annotation;

import java.util.ArrayList;

public class SuppressUncheckedWarnings {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList arr= new ArrayList();
		arr.add(123);
		arr.add("Hello");
		System.out.println(arr.toString());
	}
}
