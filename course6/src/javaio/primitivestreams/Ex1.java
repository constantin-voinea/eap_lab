package javaio.primitivestreams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author cvoinea
 *
 * 16 bits streams -> character streams
 */
public class Ex1 {

    private static final String BASE_PATH = "./course6/src/javaio/file/files/";

    public static void main(String[] args) {

        // use try-with-resources
        try (FileReader fr = new FileReader(BASE_PATH + "file1.txt");
             // check both situations for append = true/false
             FileWriter fw = new FileWriter(new File(BASE_PATH, "file2.txt"), false)) {

            int c;
            // read one character and store it in variable c while the end of the stream hasn't been reached (when -1 is returned by read() method)
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
