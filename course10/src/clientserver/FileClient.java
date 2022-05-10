package clientserver;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @author cvoinea
 */
public class FileClient {

    private static final String FILE_PATH = "course10\\src\\clientserver\\FileClient.java";
    private static final String HOST = "127.0.0.1";
    private static final int PORT = 8090;
    private Socket clientSocket;

    public FileClient(String host, int port) {
        try {
            this.clientSocket = new Socket(host, port);
        } catch (IOException e) {
            System.out.printf("Could not create client socket because of: %s", e.getMessage());
        }
    }

    public static void main(String[] args) {

        FileClient client = new FileClient(HOST, PORT);
        client.sendFile(FILE_PATH);
    }

    private void sendFile(String filePath) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
             FileInputStream fileInputStream = new FileInputStream(filePath)) {

            byte[] buffer = new byte[4096];
            int read;
            while ((read = fileInputStream.read(buffer)) > 0) {
                dataOutputStream.write(buffer, 0, read);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
