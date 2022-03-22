package interfaces.benefits.withoutinterfaces;

import interfaces.model.cup.CoffeeCup;
import interfaces.model.cup.Cup;
import interfaces.model.cup.TeaCup;

/**
 * @author cvoinea
 *
 * inheritance and polymorphism can be enough to model a small inheritance hierarchy
 * however, this wash() behaviour doesn't seem to belong to these classes, it is rather a capability ("can do" behaviour)
 *
 * What if we want other unrelated objects to exhibit this behaviour?  We could try to use an Object reference type --> see Cleaner.java
 */
public class VirtualCoffee {

    public static void prepareCup(Cup cup) {
        cup.wash();
    }

    public static void main(String[] args) {

        Cup cup = new Cup();
        prepareCup(cup);

        // dynamic polymorphism
        Cup coffeeCup = new CoffeeCup();
        prepareCup(coffeeCup);

        // dynamic polymorphism
        Cup teaCup = new TeaCup();
        prepareCup(teaCup);
    }


}
