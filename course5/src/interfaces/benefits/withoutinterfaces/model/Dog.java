package interfaces.benefits.withoutinterfaces.model;

/**
 * @author cvoinea
 */
public class Dog extends WashableObject {

    @Override
    public void wash() {
        System.out.println("washing a dog");
    }
}
