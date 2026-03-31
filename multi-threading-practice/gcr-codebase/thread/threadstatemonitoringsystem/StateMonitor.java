package thread.threadstatemonitoringsystem;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StateMonitor implements Runnable
{
    private Thread[] threads;
    private Map<String, Set<Thread.State>> stateHistory;

    public StateMonitor(Thread[] threads)
    {
        this.threads= threads;
        stateHistory= new HashMap<>();
    }

    @Override
    public void run()
    {
        boolean allTerminated= false;

        while (!allTerminated)
        {
            allTerminated= true;

            for (Thread t:threads)
            {
                Thread.State state= t.getState();
                String name= t.getName();

                stateHistory
                        .computeIfAbsent(name, k->new HashSet<>())
                        .add(state);

                System.out.println("[Monitor] "+ name +" is in "+ state +" state at "+ LocalTime.now());

                if (state!=Thread.State.TERMINATED)
                {
                    allTerminated= false;
                }
            }

            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                System.out.println("Monitor interrupted");
            }
        }

        printSummary();
    }

    private void printSummary()
    {
        System.out.println("\nSUMMARY");

        for (String name:stateHistory.keySet())
        {
            System.out.println("Summary: "+ name +" went through "+ stateHistory.get(name).size() +" states -> "+ stateHistory.get(name));
        }
    }
}
