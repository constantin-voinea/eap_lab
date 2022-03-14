package records;

import java.util.Objects;

/**
 * @author cvoinea
 *
 * actiuni repetitive de implementare constructori, getters, setters,
 * suprascriere equals(). hashCode(), toString()
 */
public class Student {

    private int id;
    private String nume;
    private String facultate;

    public Student() {
    }

    public Student(int id, String nume, String facultate) {
        this.id = id;
        this.nume = nume;
        this.facultate = facultate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(nume, student.nume) && Objects.equals(facultate, student.facultate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nume, facultate);
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", facultate='" + facultate + '\'' +
                '}';
    }
}
