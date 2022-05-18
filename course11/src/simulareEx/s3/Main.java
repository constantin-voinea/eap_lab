package simulareEx.s3;

import java.util.Comparator;
import java.util.List;

/**
 * @author cvoinea
 */
public class Main {

    public static void main(String[] args) {

        DiplomaLicenta dl1 = new DiplomaLicenta(235, "Ion", 2000, "f1", "info", 8.50);
        DiplomaLicenta dl2 = new DiplomaLicenta(234, "Paul", 2005, "f2", "mate", 10);
        DiplomaLicenta dl3 = new DiplomaLicenta(234, "Ana", 2010, "f2", "mate", 9.10);
        DiplomaLicenta dl4 = new DiplomaLicenta(233, "Mircea", 2015, "f3", "info", 7.50);
        DiplomaLicenta dl5 = new DiplomaLicenta(233, "Diana", 2020, "f3", "info", 10);
        DiplomaLicenta dl6 = new DiplomaLicenta(233, "Diana", 2018, "f3", "info", 6.50);
        DiplomaLicenta dl7 = new DiplomaLicenta(233, "Diana", 2018, "f3", "info", 6.50);

        List<DiplomaLicenta> diplome = List.of(dl1, dl2, dl3, dl4, dl5, dl6, dl7);

        // 1
        System.out.println("------------1---------------");
        diplome.stream()
                .filter(dl -> dl.getAn() <= 2010 && dl.getAn() >= 2000)
                .sorted(Comparator.comparingDouble((DiplomaLicenta::getMedie)).reversed())
                .toList()
                .forEach(System.out::println);

        // 2
        System.out.println("------------2----------------");
        diplome.stream()
                .filter(diplomaLicenta -> diplomaLicenta.getFacultate().equals("f3"))
                .filter(diplomaLicenta -> diplomaLicenta.getAn() == 2018)
                .distinct()
                .toList()
                .forEach(System.out::println);

        // 3
        System.out.println("-----------3-----------------");
        diplome.stream()
                .filter(diplomaLicenta -> diplomaLicenta.getMedie() == 10.00)
                .map(DiplomaLicenta::getAbsolvent)
                .toList()
                .forEach(System.out::println);

        // 4
        System.out.println("----------4-----------------");
        long no = diplome.stream()
                .filter(diplomaLicenta -> diplomaLicenta.getSpecializare().equals("info"))
                .count();
        System.out.println(no);

    }
}
