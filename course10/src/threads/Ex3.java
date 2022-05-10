package threads;

/**
 * @author cvoinea
 * A thread can be in one of the following states:
 * NEW - A thread that has not yet started
 * RUNNABLE - A thread executing in the Java virtual machine
 * BLOCKED - A thread that is blocked waiting for a monitor lock; can run again when key is released
 * WAITING - A thread that is waiting indefinitely for another thread to perform a particular action; can run again when notify() is called
 * TIMED_WAITING -  A thread that is waiting for another thread to perform an action for up to a specified waiting time
 * TERMINATED - A thread that has exited
 * A thread can be in only one state at a given point in time. These states are virtual machine states which do not reflect any operating system thread states.
 */
public class Ex3 {

    public static void main(String[] args) throws InterruptedException {

        // thread states
        for (Thread.State ts : Thread.State.values())
            System.out.println(ts);

        Thread t1 = new Thread(() -> System.out.println(Thread.currentThread().getName() + " in state " + Thread.currentThread().getState()), "t1");
        System.out.println(t1.getName() + " in state " + t1.getState()); // thread created, but not running
        t1.start(); // in RUNNABLE state, thread is running or ready to run (waiting for resource allocation from thread scheduler)

        Thread t2 = new Thread(new Processor(), "p1");
        Thread t3 = new Thread(new Processor(), "p2");
        t2.start();
        t3.start();
        Thread.sleep(10 * 1000);
        System.out.println(t3.getName() + " in state " + t3.getState());
        System.exit(0);

    }
}
