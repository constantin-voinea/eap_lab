package javaio.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author cvoinea
 */
public class SerializationTest {

    private static final String BASE_PATH = "./course6/src/javaio/file/files";

    public static void main(String[] args) {

        Person p1 = new Person("John", 20);

        serializePerson(p1);

    }

    private static void serializePerson(Person person) {

        try (FileOutputStream fileOutputStream = new FileOutputStream(new File(BASE_PATH, "p1"));
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){

            objectOutputStream.writeObject(person);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
