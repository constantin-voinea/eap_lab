package interfaces.benefits.withoutinterfaces.model;

/**
 * @author cvoinea
 */
public class Window extends WashableObject {

    @Override
    public void wash() {
        System.out.println("washing a window");
    }
}
