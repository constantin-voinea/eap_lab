package threads;

/**
 * @author cvoinea
 * thread name
 * thread priorities -> integers [1,10]
 */
public class Ex5 {

    public static void main(String[] args) {

        // implicit priority = 5
        // specify thread name as parameter in constructor
        // Thread.currentThread() returns a reference to the Thread instance executing currentThread()
        Thread t1 = new Thread(() -> System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority()), "t1");
        t1.start();

        Thread t2 = new Thread(() -> System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority()), "t2");
        t2.setPriority(7);
        t2.start();

        Thread t3 = new Thread(() -> System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority()), "t3");
        // MIN_PRIORITY, NORM_PRIORITY, MAX_PRIORITY
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();

        System.out.println(Thread.currentThread().getName()); //name of thread that runs main()

    }
}
