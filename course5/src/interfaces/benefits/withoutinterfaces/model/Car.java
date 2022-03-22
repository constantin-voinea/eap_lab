package interfaces.benefits.withoutinterfaces.model;

/**
 * @author cvoinea
 */
public class Car extends WashableObject {

    @Override
    public void wash() {
        System.out.println("washing a car");
    }
}
