import java.util.Stack;

public class QueueUsingStacks {

	private Stack<Integer> stack1;
	private Stack<Integer> stack2;

	public QueueUsingStacks() {
		stack1= new Stack<>();
		stack2= new Stack<>();
	}

	//enqueue operation
	public void enqueue(int data) {
		stack1.push(data);
		System.out.println("Enqueued: "+data);
	}

	//dequeue operation
	public void dequeue() {

		if (stack1.isEmpty() && stack2.isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}

		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}

		System.out.println("Dequeued: "+stack2.pop());
	}

	//peek operation
	public void peek() {

		if (stack1.isEmpty() && stack2.isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}

		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}

		System.out.println("Front Element: "+stack2.peek());
	}

	//display queue
	public void display() {

		if (stack1.isEmpty() && stack2.isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}

		System.out.print("Queue Elements: ");

		for (int i= stack2.size()-1;i>=0;i--) {
			System.out.print(stack2.get(i)+" ");
		}

		for (int i= 0;i<stack1.size();i++) {
			System.out.print(stack1.get(i)+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		QueueUsingStacks queue= new QueueUsingStacks();

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

		queue.display();

		queue.dequeue();
		queue.peek();

		queue.enqueue(40);
		queue.display();
	}
}
