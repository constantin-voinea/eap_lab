package singleton;

/**
 * @author cvoinea
 *
 * private static instance
 * private constructor
 * static getInstance() utility method
 */
public class EagerSingleton {

    // initialised on class loading
    private static EagerSingleton instance;

    static {
        instance = new EagerSingleton();
    }

    //private constructor
    private EagerSingleton() {
    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}
