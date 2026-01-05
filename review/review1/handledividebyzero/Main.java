package review.handledividebyzero;

public class Main {
	public static void main(String[] args) {
		int n= 5;
		int result= 0;
		
		try {
			result=n/0;
		}
		catch(ArithmeticException e) {
			System.out.println("message:"+e.getMessage());
		}
	}
}
