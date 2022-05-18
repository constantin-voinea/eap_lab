package simulareEx.s1.e5;

/**
 * @author cvoinea
 */
public class Sir {
    static String sir = "A";

    void a() {
        try {
            sir = sir + "B";
            b();
        } catch (Exception e) {
            sir = sir + "C";
        }
    }

    void b() throws Exception {
        try {
            sir = sir + "D";
            c();
        } catch (Exception e) {
            throw new Exception();
        } finally {
            sir = sir + "E";
        }
    }

    void c() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        Sir s = new Sir();
        s.a();
        System.out.println(sir);
    }

}
