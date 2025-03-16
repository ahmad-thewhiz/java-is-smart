import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

    public Runnable getRunnable() {
        return new Runnable() {
            @Override
            public void run() {
                int port = 8010;
                
                try {
                    InetAddress address = InetAddress.getByName("localhost");

                    // Creating socket and connecting to the server
                    try (Socket socket = new Socket(address, port);
                         PrintWriter toSocket = new PrintWriter(socket.getOutputStream(), true);
                         BufferedReader fromSocket = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

                        // Sending message to the server
                        toSocket.println("client is active.");

                        // Receiving message from socket
                        String line = fromSocket.readLine();
                        System.out.println("response from socket: " + line);

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        };
    }

    public static void main(String[] args) {
        Client client = new Client();

        for (int i = 0; i < 100000; i++) {
            try {
                Thread thread = new Thread(client.getRunnable());
                thread.start();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
