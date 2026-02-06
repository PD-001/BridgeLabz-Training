package thread.printshopjobscheduler;

public class PrintJob implements Runnable {

	private String jobName;
	private int pages;
	private int priority;

	public PrintJob(String jobName, int pages, int priority) {
		this.jobName= jobName;
		this.pages= pages;
		this.priority= priority;
	}

	public int getPriority() {
		return priority;
	}

	public String getJobName() {
		return jobName;
	}

	public int getPages() {
		return pages;
	}

	@Override
	public void run() {

		String priorityLabel= getPriorityLabel(priority);

		for(int i=1;i<=pages;i++) {

			System.out.println("["+ priorityLabel +"] Printing "+ jobName +" - Page "+ i + " of " + pages);

			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				System.out.println("Interrupted: "+ e.getMessage());
			}
		}

		System.out.println(jobName +" completed");
	}

	public static String getPriorityLabel(int priority) {

		if(priority>=7) {
			return "High Priority";
		}
		else if(priority>=5) {
			return "Medium Priority";
		}
		else {
			return "Low Priority";
		}
	}

}
