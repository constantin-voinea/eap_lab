package siruridecaractere;

/**
 * @author cvoinea
 *
 * String, StringBuilder, StringBuffer
 */
public class TestSiruri {

    private static String defaultString; // default null pt tipuri referinta
    private int numar = 989887; // literal

    public static void main(String[] args) {

        System.out.println(defaultString); // null

        String s1 = ""; // empty String
        String s2 = "abc"; // String pool
        System.out.println(s2); // abc
        s2.toUpperCase(); // imutabilitate, valoarea referentiata de s2 nu se modifica
        System.out.println(s2); // abc
        s2 = s2.toUpperCase(); // "ABC" -se creeaza un nou obiect String in String pool, referentiat de s2
        System.out.println(s2); // ABC

        String s3 = "cde";
        String s4 = new String("cde"); // alocare explicita de memorie pe heap
        String s5 = "cde"; // referinta catre acelasi obiect "cde" din String pool
        System.out.println(s3 == s4); //false , referinte diferite catre obiecte diferite
        System.out.println(s4 == s5); //false
        System.out.println(s3 == s5); // true
        System.out.println(s3.equals(s4)); // true -> comparare continut
        s4 = s4.intern(); // trecere explicita in String pool
        System.out.println(s3 == s4); //true
        System.out.println(s3 == s5); // true

        String s6 = "efg";
        System.out.println(s6.toUpperCase() == s6.toUpperCase()); // false

        System.out.println("-----------intern()----------------");
        s3 = s3.intern(); // trecere explicita in string pool
        System.out.println(s2 == s3); // true

        System.out.println("-----StringBuilder-----");
        String adresa = s1 + s2 + s3 + s4.toUpperCase() + s5.length(); // utilizare ineficienta a memoriei
        StringBuilder sb = new StringBuilder(s1);
        sb.append(1234); // se returneaza aceeasi instanta de StringBuilder, se adauga la final
        System.out.println("string builder: " + sb);
        System.out.println(sb.reverse()); // inversare

        String s7 = adresa + sb; // concatenare String si StringBuilder
        System.out.println("s7 = " + s7);

        StringBuilder sb1 = new StringBuilder();
        sb1.append('f').append(s2).append(s3).append(3).append(true).append(33).append(2.2d); // inlantuire apel metode
        System.out.println(sb1);

        sb1.replace(0, 1, "gg");
        System.out.println(sb1.reverse());

        // StringBuffer este thread-safe fata de StringBuilder => metodele sunt sincronizate => executie mai lenta
        StringBuffer sbf = new StringBuffer(adresa); // conversie de la String la StringBuffer
        System.out.println(sbf.reverse());
        StringBuffer sbf1 = new StringBuffer(sb); // conversie de la StringBuilder la StringBuffer
        System.out.println(sbf1);
        StringBuilder sb2 = new StringBuilder(sbf); // conversie de la StringBuffer la StringBuilder
        System.out.println(sb2);

    }
}
