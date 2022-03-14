package records;

/**
 * @author cvoinea
 *  un record are un nume si o descriere a starii, care declara componentele acelui record
 *  optional, un record are si un body
 *
 *  Pentru ca se vrea a fi un nou tip simplu, un container de date, primeste automat urmatoarele functionalitati:
 *        - cate un camp final si privat pt toate componentele din descrierea starii
 *        - cate o metoda publica de accesare a acestor componente de stare (campuri)
 *        - un constructor public cu aceeasi semnatura cu cea din descriere
 *        - implementari pentru equals() si hashCode(): doua recorduri sunt egale daca au acelasi tip si aceeasi stare
 *        - o implementare toString() care cuprinde reprezentarea String a componentelor
 *        - body-ul poate contine metode statice, campuri statice, blocuri de initializare, constructori, metode de instanta si tipuri nested
 *
 *  Restrictii:
 *    - nu pot extinde alte clase
 *    - nu pot declara alte campuri decat cele definite ca stare (pot avea doar variabile de clasa in plus)
 *    - nu pot fi abstracte pt ca implicit sunt final
 *
 */
public record StudentRecord(int id, String nume, String facultate) { // poate fi suficienta o sg. linie de cod

    private static String adresa;

    public static String getAdresa() {
        return adresa;
    }

    public String getFacultate() {
        return facultate();
    }
}
