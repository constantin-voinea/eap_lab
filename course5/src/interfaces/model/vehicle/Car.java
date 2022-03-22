package interfaces.model.vehicle;

import interfaces.basics.Washable;

/**
 * @author cvoinea
 */
public class Car implements Washable {

    @Override
    public void wash() {
        System.out.println("washing a car");
    }
}
