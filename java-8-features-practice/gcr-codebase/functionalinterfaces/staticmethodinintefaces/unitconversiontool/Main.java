package functionalinterfaces.staticmethodinintefaces.unitconversiontool;

public class Main {
	public static void main(String[] args) {
		System.out.println("3 km in miles :"+ Conversions.kmtomile(3));
		System.out.println("3 miles in km :"+ Conversions.miletokm(3));
	}
}
