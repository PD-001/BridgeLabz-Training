class TaskNode {
	int taskId;
	String taskName;
	int priority;
	String dueDate;
	TaskNode next;

	//constructor
	TaskNode(int taskId,String taskName,int priority,String dueDate) {
		this.taskId= taskId;
		this.taskName= taskName;
		this.priority= priority;
		this.dueDate= dueDate;
		this.next= null;
	}
}

public class TaskSchedulerCircularLinkedList {

	private TaskNode head;
	private TaskNode tail;
	private TaskNode currentTask;

	//method to add task at beginning
	public void addAtBeginning(int taskId,String taskName,int priority,String dueDate) {
		TaskNode newNode= new TaskNode(taskId,taskName,priority,dueDate);

		if (head==null) {
			head= newNode;
			tail= newNode;
			newNode.next= head;
			currentTask= head;
		}
		else {
			newNode.next= head;
			head= newNode;
			tail.next= head;
		}
		System.out.println("Task added at beginning");
	}

	//method to add task at end
	public void addAtEnd(int taskId,String taskName,int priority,String dueDate) {
		TaskNode newNode= new TaskNode(taskId,taskName,priority,dueDate);

		if (head==null) {
			head= newNode;
			tail= newNode;
			newNode.next= head;
			currentTask= head;
			return;
		}

		tail.next= newNode;
		newNode.next= head;
		tail= newNode;
		System.out.println("Task added at end");
	}

	//method to add task at specific position
	public void addAtPosition(int position,int taskId,String taskName,int priority,String dueDate) {
		if (position==1) {
			addAtBeginning(taskId,taskName,priority,dueDate);
			return;
		}

		TaskNode newNode= new TaskNode(taskId,taskName,priority,dueDate);
		TaskNode temp= head;

		for (int i=1;i<position-1 && temp.next!=head;i++) {
			temp= temp.next;
		}

		newNode.next= temp.next;
		temp.next= newNode;

		if (temp==tail) {
			tail= newNode;
		}
		System.out.println("Task added at position "+position);
	}

	//method to remove task by task id
	public void removeByTaskId(int taskId) {
		if (head==null) {
			System.out.println("Task list is empty");
			return;
		}

		TaskNode temp= head;
		TaskNode prev= tail;

		do {
			if (temp.taskId==taskId) {

				if (temp==head) {
					head= head.next;
					tail.next= head;
					currentTask= head;
				}
				else if (temp==tail) {
					tail= prev;
					tail.next= head;
				}
				else {
					prev.next= temp.next;
				}

				System.out.println("Task removed successfully");
				return;
			}
			prev= temp;
			temp= temp.next;
		} while (temp!=head);

		System.out.println("Task not found");
	}

	//method to view current task and move to next
	public void viewNextTask() {
		if (currentTask==null) {
			System.out.println("No tasks available");
			return;
		}

		displaySingleTask(currentTask);
		currentTask= currentTask.next;
	}

	//method to display all tasks
	public void displayAllTasks() {
		if (head==null) {
			System.out.println("No tasks available");
			return;
		}

		TaskNode temp= head;
		do {
			displaySingleTask(temp);
			temp= temp.next;
		} while (temp!=head);
	}

	//method to search task by priority
	public void searchByPriority(int priority) {
		if (head==null) {
			System.out.println("No tasks available");
			return;
		}

		TaskNode temp= head;
		boolean found= false;

		do {
			if (temp.priority==priority) {
				displaySingleTask(temp);
				found= true;
			}
			temp= temp.next;
		} while (temp!=head);

		if (!found) {
			System.out.println("No task found with given priority");
		}
	}

	//method to display single task
	private void displaySingleTask(TaskNode task) {
		System.out.println("Task ID: "+task.taskId);
		System.out.println("Task Name: "+task.taskName);
		System.out.println("Priority: "+task.priority);
		System.out.println("Due Date: "+task.dueDate);
		System.out.println();
	}

	public static void main(String[] args) {

		TaskSchedulerCircularLinkedList scheduler= new TaskSchedulerCircularLinkedList();

		scheduler.addAtBeginning(101,"Design Module",1,"2025-01-10");
		scheduler.addAtEnd(102,"Code Review",2,"2025-01-12");
		scheduler.addAtPosition(2,103,"Testing",1,"2025-01-15");

		System.out.println();
		scheduler.displayAllTasks();

		System.out.println();
		scheduler.searchByPriority(1);

		System.out.println();
		scheduler.viewNextTask();
		scheduler.viewNextTask();

		System.out.println();
		scheduler.removeByTaskId(102);

		System.out.println();
		scheduler.displayAllTasks();
	}
}
