package simulareEx.s2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cvoinea
 */
public class Cuvinte {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        new Parser(5).start();
    }
}

class Parser extends Thread {

    private final int lungimeCuvant;

    public Parser(int lungimeCuvant) {
        this.lungimeCuvant = lungimeCuvant;
    }

    @Override
    public void run() {
        System.out.println(currentThread().getName());
        try {
            List<String> linii = Files.lines(Paths.get("course11/src/simulareEx/s2/poezie1.txt")).toList();
            linii.stream()
                    .map(s -> s.split("[-\\[\\]!~.,:;(){}@*/\"\\s]+"))
                    .flatMap(Arrays::stream)
                    .filter(s -> s.length() == lungimeCuvant)
                    .collect(Collectors.toSet())
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
