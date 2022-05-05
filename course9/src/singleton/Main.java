package singleton;

/**
 * @author cvoinea
 */
public class Main {

    public static void main(String[] args) {

        EagerSingleton e1 = EagerSingleton.getInstance();
        EagerSingleton e2 = EagerSingleton.getInstance();
        System.out.println(e1.equals(e2)); // true

        LazySingleton lz1 = LazySingleton.getInstance();
        LazySingleton lz2 = LazySingleton.getInstance();
        System.out.println(lz1.equals(lz2)); // true
    }
}
