package threads;

import java.util.stream.IntStream;

/**
 * @author cvoinea
 * how to (try to) stop a thread
 * stop() is deprecated, should not be used; it still exists for legacy code, backwards compat reasons
 * stop() can lead to monitored objects to be corrupted
 * use interrupt() with interrupted() (or volatile flag) instead
 */
public class Ex4 {

    public static void main(String[] args) throws InterruptedException {

        PrintEvenNumbers task = new PrintEvenNumbers(1, 5);
        Thread thread = new Thread(task, "t1");
        thread.start();
        System.out.println(thread.getName() + " in state " + thread.getState());
        // use interruption to request a task, running on a separate thread, to finish
        thread.interrupt();
    }

    static class PrintEvenNumbers implements Runnable {

        int rangeFrom;
        int rangeTo;

        public PrintEvenNumbers(int rangeFrom, int rangeTo) {
            this.rangeFrom = rangeFrom;
            this.rangeTo = rangeTo;
        }

        @Override
        public void run() {
            IntStream.rangeClosed(rangeFrom, rangeTo).filter(i -> i % 2 == 0).forEach(System.out::println);
            System.out.println("is thread interrupted -> " + Thread.currentThread().isInterrupted());
            // returns true if the current thread is interrupted
            // it will also clear the interrupted state
            if (Thread.interrupted()) {
                System.out.println("is thread interrupted -> " + Thread.currentThread().isInterrupted());
            }
            System.out.println(Thread.currentThread().getName() + " is running task");
        }
    }
}
