import java.util.Stack;

public class StockSpan {

	//method to calculate stock span
	public static void calculateSpan(int[] price,int[] span) {

		Stack<Integer> stack= new Stack<>();

		//first day span is always 1
		stack.push(0);
		span[0]= 1;

		for (int i=1;i<price.length;i++) {

			while (!stack.isEmpty() && price[stack.peek()]<=price[i]) {
				stack.pop();
			}

			if (stack.isEmpty()) {
				span[i]= i+1;
			}
			else {
				span[i]= i-stack.peek();
			}

			stack.push(i);
		}
	}

	//method to display result
	public static void displaySpan(int[] price,int[] span) {

		System.out.println("Price  Span");

		for (int i=0;i<price.length;i++) {
			System.out.println(price[i]+"     "+span[i]);
		}
	}

	public static void main(String[] args) {

		int[] price= {100,80,60,70,60,75,85};
		int[] span= new int[price.length];

		calculateSpan(price,span);
		displaySpan(price,span);
	}
}
