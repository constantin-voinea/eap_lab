package interfaces.benefits.withoutinterfaces;

import interfaces.benefits.withoutinterfaces.model.Car;
import interfaces.benefits.withoutinterfaces.model.CoffeeCup;
import interfaces.benefits.withoutinterfaces.model.Cup;
import interfaces.benefits.withoutinterfaces.model.Dog;
import interfaces.benefits.withoutinterfaces.model.WashableObject;
import interfaces.benefits.withoutinterfaces.model.Window;

/**
 * @author cvoinea
 *
 * try to use a common supertype --> WashableObject
 */
public class ImprovedCleaner {

    // when forcing a relation between different object models
    public static void clean(WashableObject washableObject) {
        washableObject.wash();
    }


    public static void main(String[] args) {
        Dog dog = new Dog();
        clean(dog);

        Window window = new Window();
        clean(window);

        Car car = new Car();
        clean(car);

        Cup cup = new CoffeeCup();
        clean(cup);

        String unknownType = "unknown type";
//        clean(unknownType); //does not compile, not a WashableObject

    }
}
