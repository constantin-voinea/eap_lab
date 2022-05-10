package threads;

/**
 * @author cvoinea
 * a thread is defined at the OS level and it consists of a set of instructions
 * JVM works with several threads (GC, JIT etc)
 * scheduler - responsible for CPU sharing
 * reasons to pause a thread (by the scheduler):
 *  - CPU should be shared equally among threads
 *  - a thread might be waiting for some data to be available
 *  - a thread might be waiting for another thread to do something
 */
public class Ex1 {

    public static void main(String[] args) {

        // create a thread from Thread class
        Thread t1 = new Thread();
        /*
         *  doesn't specify a task for the thread to execute
         * the thread will stop right away after it is started
         */
        t1.start();

        // create thread by extending Thread class
        MyThread t2 = new MyThread();
        // this call returns as soon as the thread is started
        // it doesn't wait until run() method is completed
        t2.start();

        // create anonymous subclass of Thread
        Thread t3 = new Thread("t3 thread") {
            @Override
            public void run() {
                System.out.println("anonymous subclass for: " + this.getName());
            }
        };
        t3.start();

    }
}
