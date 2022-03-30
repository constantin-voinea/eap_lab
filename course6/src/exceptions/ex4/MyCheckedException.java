package exceptions.ex4;

/**
 * @author cvoinea
 * <p>
 * custom checked exception
 */
public class MyCheckedException extends Exception {

    public MyCheckedException(String s) {
        super(s);
    }
}
