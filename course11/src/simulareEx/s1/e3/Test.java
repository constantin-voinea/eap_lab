package simulareEx.s1.e3;

/**
 * @author cvoinea
 */
public class Test {

    public static void main(String[] args) {
        A b = new B();
        b.doA("P");
//        b.doA("Q", "R");

//        ((B)b).doA("P");
    }
}

class A {
    public static void doA(String a) {
        System.out.print("A" + a);
    }
}

class B extends A {
    public static void doA(String a) {
        System.out.print("B" + a);
    }
    public void doA(String a, String b) {
        System.out.print("B" + a + b);
    }
}
