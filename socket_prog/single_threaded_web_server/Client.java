import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Client {
    public void run() throws UnknownHostException, IOException {
        int port=8010;
        InetAddress address= InetAddress.getByName("localhost");
        
        Socket socket=new Socket(address, port);

        // communication stream
        PrintWriter toSocket=new PrintWriter(socket.getOutputStream(), true);
        BufferedReader fromSocket=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        
        // sending message to the server
        toSocket.println("client is active.");
        
        // receiving message from socket
        String line=fromSocket.readLine();
        System.out.println("response from socket: "+line);

        toSocket.close();
        fromSocket.close();
        socket.close();
    }


    public static void main(String args[]) {
        try{
            Client client=new Client();
            client.run();
        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}