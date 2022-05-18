package simulareEx.s1.e1;

import java.util.HashSet;

/**
 * @author cvoinea
 */
public class Automobil {

    private String marca;

    public Automobil(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public static void main(String[] args) {

        HashSet<Automobil> automobile = new HashSet<>();
        automobile.add(new Automobil("dacia"));
        automobile.add(new Automobil("renault"));
        automobile.add(new Automobil("peugeot"));
        automobile.add(new Automobil("citroen"));
        System.out.println(automobile.size()); //1
    }
}
