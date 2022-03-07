package polymorphism.zoo.omnivor;

import polymorphism.zoo.Animal;

/**
 * @author cvoinea
 */
public abstract class Omnivor extends Animal {

    public Omnivor(String nume, int varsta) {
        super(nume, varsta);
        this.tipHrana = "carne si vegetatie";
    }

    @Override
    public void seHraneste() {
        System.out.println(this + " se hraneste cu " + this.tipHrana);
    }
}
