
public class Circle {

	//non-static variable
	double radius;

	//default constructor
	Circle() {
		this.radius= 1.0; // constructor chaining
	}

	//parameterized constructor
	Circle(double radius) {
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

		//using default constructor
		Circle circle1= new Circle();
		circle1.areaCircle();
		circle1.circumferenceCircle();

		System.out.println();

		//using parameterized constructor
		Circle circle2= new Circle(2.5);
		circle2.areaCircle();
		circle2.circumferenceCircle();
	}
}
