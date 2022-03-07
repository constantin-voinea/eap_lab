package polymorphism.zoo.ierbivor;

import polymorphism.zoo.Animal;

/**
 * @author cvoinea
 */
public abstract class Ierbivor extends Animal {

    public Ierbivor(String nume, int varsta) {
        super(nume, varsta);
        this.tipHrana = "vegetatie";
    }

    @Override
    public void seHraneste() {
        System.out.println(this + " se hraneste cu " + this.tipHrana);
    }
}
