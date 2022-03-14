package imutabilitate;

/**
 * @author cvoinea
 */
public class TestImutabilitate {

    public static void main(String[] args) {

        Adresa adresaMutabila = new Adresa("Unirii", 10);
        System.out.println(adresaMutabila);
        Persoana persoana = new Persoana(1, "Ion", adresaMutabila);
        System.out.println(persoana);
        /*
        incercare alterare valoare camp 'nume' din obiectul persoana
        String este o clasa imutabila, deci valoarea membrului obiectului persoana nu se va modifica
         */
        System.out.println(persoana.getNume().toUpperCase());
        System.out.println(persoana);

        /*
        incercare alterare valoare membru (clasa mutabila) prin modificarea valorilor
        instantei date ca parametru la instantierea clasei imutabile
         */
        adresaMutabila.setStrada("I.C. Bratianu");
        System.out.println("-----------dupa modificare atribut adresa-----------------");
        System.out.println(adresaMutabila);
        System.out.println(persoana);

        // incercare alterare continut prin intermediul get-erului
        System.out.println("-------------demo getters---------------");
        Adresa adresaNoua = persoana.getAdresa();
        adresaNoua.setStrada("Decebal");
        System.out.println(persoana);

    }
}
