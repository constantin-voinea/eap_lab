package threads;

/**
 * @author cvoinea
 */
public class Processor implements Runnable{

    @Override
    public void run() {
        accessCommonResource();
    }

    // only one thread at a time can access this method
    // subsequent threads that try to access this method will be blocked from the further execution until the current one will finish the processing
    private static synchronized void accessCommonResource() {
        while (true){
            System.out.println("Hello " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
