package thread.threadstatemonitoringsystem;

public class Main
{
    public static void main(String[] args)
    {
        Thread task1= new Thread(new TaskRunner("Task1"), "T1");
        Thread task2= new Thread(new TaskRunner("Task2"), "T2");

        Thread[] tasks= { task1, task2 };

        Thread monitor= new Thread(new StateMonitor(tasks), "Monitor");

        monitor.start();

        task1.start();
        task2.start();
    }
}
