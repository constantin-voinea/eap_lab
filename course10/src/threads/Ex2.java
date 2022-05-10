package threads;

/**
 * @author cvoinea
 * implementing Runnable functional interface
 * might be the preferred solution to work with threads
 * - if defining a class that implements Runnable, that class can also extend another class
 * - decouple implementation (contract through interface) from execution (actual thread) -> composition over inheritance
 * - easy to queue runnables to be executed by a thread pool
 */
public class Ex2 {

    public static void main(String[] args) {

        // create a thread by implementing Runnable interface
        MyRunnable r1 = new MyRunnable();
        Thread t1 = new Thread(r1);
        t1.start();

        //same example, but using anonymous class implementing Runnable
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("anonymous class implementing Runnable ");
            }
        };
        Thread t2 = new Thread(r2);
        t2.start();

        // using lambda expression to declare the implementation for run() method in Runnable functional interface
        Runnable r3 = () -> System.out.println("my runnable r3");
        Thread t3 = new Thread(r3);
        t3.start();

        // more concise example
        new Thread(() -> System.out.println("runnable for t4"), "t4").start();

        // do not call run() instead of start() -> in this case, run() will not be executed by the new thread created
        Thread t5 = new Thread(() -> System.out.println("actually running on thread: " + Thread.currentThread().getName()));
        t5.run();

    }
}
