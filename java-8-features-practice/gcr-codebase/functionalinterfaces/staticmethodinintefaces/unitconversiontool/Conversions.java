package functionalinterfaces.staticmethodinintefaces.unitconversiontool;

public interface Conversions {

	public static double kmtomile(double km) {
		return km*0.621371;
	}
	
	public static double miletokm(double mile) {
		return mile*1.60934;
	}
	
}
