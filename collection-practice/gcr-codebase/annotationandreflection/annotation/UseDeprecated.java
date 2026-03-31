package annotationandreflection.annotation;

class LegacyAPI {
	
	@Deprecated
	public void oldFeature() {
		System.out.println("Old way of work");
	}
	
	public void newFeature() {
		System.out.println("New way of work");
	}
}

public class UseDeprecated {
	public static void main(String[] args) {
		LegacyAPI features= new LegacyAPI();
		features.oldFeature();
		features.newFeature();
	}
}
