import java.io.*;
import java.net.*;

public class ReverseEchoServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(2000);
        Socket stk = ss.accept();

        // Input Stream
        BufferedReader read = new BufferedReader(new InputStreamReader(stk.getInputStream()));

        // Output Stream
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;
        StringBuilder sb;

        do {
            msg = read.readLine();
            sb = new StringBuilder(msg);

            sb.reverse();
            msg = sb.toString();

            ps.println(msg);
        } while (!msg.equals("dne")); // reverse of "end"

        ss.close();
    }
}
