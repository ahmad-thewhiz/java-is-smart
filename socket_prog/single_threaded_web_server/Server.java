import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public void run() throws IOException {
        int port = 8010;
        
        ServerSocket socket = null;
        
        try {
            socket = new ServerSocket(port);
            socket.setSoTimeout(30000);
            System.out.println("server is listening on port: " + port);
            
            while (true) {
                try {
                    // accepting incoming client connection
                    Socket acceptedConnection = socket.accept();
                    System.out.println("accepted connection from: " + acceptedConnection.getRemoteSocketAddress());
                    
                    // communication stream
                    PrintWriter toClient = new PrintWriter(acceptedConnection.getOutputStream(), true); // autoFlush  ensures that the data written to the PrintWriter is immediately flushed (sent out) to the underlying stream whenever a newline character (\n), carriage return (\r), or a combination of the two is encountered.
                    BufferedReader fromClient = new BufferedReader(new InputStreamReader(acceptedConnection.getInputStream()));
                    
                    // sending message to client
                    toClient.println("server says hi.");

                    // reading client's message
                    String clientMessage;
                    while ((clientMessage = fromClient.readLine()) != null) {
                        System.out.println("Client says: " + clientMessage); 
                        toClient.println("You said: " + clientMessage);
                    }

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } finally {
            if (socket != null) {
                socket.close(); 
            }
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        try {
            server.run();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
