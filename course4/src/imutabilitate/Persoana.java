package imutabilitate;

/**
 * @author cvoinea
 *
 * creare clasa imutabila
 */
// clasa final - interzicere mostenire
public final class Persoana {

    // campuri private si final - initializate o sg. data si accesate doar indirect, prin get-eri
    private final int id;
    private final String nume;
    private final Adresa adresa; // clasa mutabila asociata

    public Persoana(int id, String nume, Adresa adresa) {
        this.id = id;
        this.nume = nume;
        this.adresa = new Adresa(adresa); //folosire constructor supraincarcat din membrul mutabil Adresa
    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public Adresa getAdresa() {
        return new Adresa(adresa); // returnam referinta catre o "copie" a obiectului mutabil
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", adresa=" + adresa +
                '}';
    }
}
