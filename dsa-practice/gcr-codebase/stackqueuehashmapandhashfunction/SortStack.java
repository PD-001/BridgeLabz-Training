import java.util.Stack;

public class SortStack {

	//method to sort the stack
	public static void sortStack(Stack<Integer> stack) {

		if (stack.isEmpty()) {
			return;
		}

		int top= stack.pop();
		sortStack(stack);
		insertInSortedOrder(stack,top);
	}

	//method to insert element in sorted position
	public static void insertInSortedOrder(Stack<Integer> stack,int element) {

		if (stack.isEmpty() || stack.peek()<=element) {
			stack.push(element);
			return;
		}

		int temp= stack.pop();
		insertInSortedOrder(stack,element);
		stack.push(temp);
	}

	//display stack
	public static void display(Stack<Integer> stack) {

		System.out.println(stack);
	}

	public static void main(String[] args) {

		Stack<Integer> stack= new Stack<>();

		stack.push(30);
		stack.push(10);
		stack.push(50);
		stack.push(20);

		System.out.println("Original Stack:");
		display(stack);

		sortStack(stack);

		System.out.println("Sorted Stack:");
		display(stack);
	}
}
