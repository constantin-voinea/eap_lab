package clientserver;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author cvoinea
 */
public class FileServer extends Thread {

    private ServerSocket serverSocket;

    public FileServer(int serverPort) {
        try {
            this.serverSocket = new ServerSocket(serverPort);
        } catch (IOException e) {
            System.out.printf("Could not create server socket because of: %s", e.getMessage());
        }
    }

    public static void main(String[] args) {

        FileServer server = new FileServer(8090);
        server.start();

        System.out.println("executing on thread " + currentThread().getName()); // main
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Server listening for incoming connections...");
            listen();
        }
    }

    private void listen() {
        try {
            Socket client = serverSocket.accept();
            String clientAddress = client.getInetAddress().getHostAddress();
            System.out.println(clientAddress + " connected to server");
            saveFile(client);
            System.out.println("File received");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void saveFile(Socket client) {

        try (DataInputStream dataInputStream = new DataInputStream(client.getInputStream());
             FileOutputStream fileOutputStream = new FileOutputStream("course10\\src\\clientserver\\test", true)) {

            System.out.println("Server receiving file from client...");
            byte[] buffer = new byte[4096];
            int read;
            while ((read = dataInputStream.read(buffer)) > 0) {
                fileOutputStream.write(buffer, 0, read);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
