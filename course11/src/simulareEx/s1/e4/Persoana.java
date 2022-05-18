package simulareEx.s1.e4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author cvoinea
 */
public class Persoana implements Serializable {

    private String nume;
    private int varsta;

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persoana.per"))) {
            Persoana p = new Persoana("io", 37), q = p;
            System.out.println(q);
            oos.writeObject(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persoana.per"))) {
            Persoana q = (Persoana) ois.readObject();
            System.out.println(q);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
