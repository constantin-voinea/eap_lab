package interfaces.benefits.withinterfaces;

import interfaces.basics.Washable;
import interfaces.model.animal.Dog;
import interfaces.model.vehicle.Car;

/**
 * @author cvoinea
 */
public class Test1 {

    public static void main(String[] args) {

        Washable washable;
//        washable = new Washable(); // cannot be directly instantiated

        // reference to an object of an implementing class
        Washable car = new Car();
        car.wash();

        Washable dog = new Dog();
        // default method inherited and accessible
        if (dog.needsWashing()) {
            dog.wash();
        }
    }


}
