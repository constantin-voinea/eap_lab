package records;

/**
 * @author cvoinea
 */
public class TestRecords {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setId(1);
        s1.setNume("Ion");
        s1.setFacultate("Info");
        System.out.println(s1);

        Student s2 = new Student(1, "Ion", "Info");

        boolean comparareStudenti = s1.equals(s2); // true
        System.out.println(comparareStudenti);


        StudentRecord sr1 = new StudentRecord(1, "Adi", "mate");
        System.out.println(sr1.toString());
        System.out.println(sr1.hashCode());
        StudentRecord sr2 = new StudentRecord(1, "Adi", "mate");
        System.out.println(sr2.hashCode());
        System.out.println(sr1.equals(sr2)); // true

        System.out.println(sr1.facultate());
        System.out.println(sr2.getFacultate());
    }
}
