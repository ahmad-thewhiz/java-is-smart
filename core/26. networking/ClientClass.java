import java.io.*;
import java.net.*;

public class ClientClass {
    public static void main(String[] args) throws Exception {
        Socket stk = new Socket("localhost", 2000); // Use "localhost" if both server and client run on the same machine

        // Read from keyboard
        BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));

        // Input Stream
        BufferedReader read = new BufferedReader(new InputStreamReader(stk.getInputStream()));

        // Output Stream
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;

        do {
            msg = keyRead.readLine();
            ps.println(msg);

            msg = read.readLine();
            System.out.println("From Server: " + msg);
        } while (!msg.equals("dne")); // reverse of "end"

        stk.close();
    }
}
