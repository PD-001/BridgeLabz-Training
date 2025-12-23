
public class AreaOfCircle {

	//non-static variable
	double radius;

	//constructor
	AreaOfCircle(double radius) {
		this.radius= radius;
	}

	//method to calculate area of circle
	public void areaCircle() {
		System.out.printf("Area of circle: %.4f", (Math.PI*radius*radius));
	}

	//method to calculate circumference of circle
	public void circumferenceCircle() {
		System.out.printf("\nCircumference of circle: %.4f", (2*Math.PI*radius));
	}

	public static void main(String[] args) {
		AreaOfCircle circle= new AreaOfCircle(2.5);

		circle.areaCircle();
		circle.circumferenceCircle();
	}
}
