import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadedServer extends Thread {

    private Socket stk;

    public MultiThreadedServer(Socket st) {
        stk = st;
    }

    public void run() {
        try {
            // Input Stream
            BufferedReader read = new BufferedReader(new InputStreamReader(stk.getInputStream()));

            // Output Stream
            PrintStream ps = new PrintStream(stk.getOutputStream());

            String msg;
            StringBuilder sb;

            do {
                msg = read.readLine();
                if (msg == null) break; // Prevent null pointer issues when a client disconnects
                sb = new StringBuilder(msg);

                sb.reverse();
                msg = sb.toString();

                ps.println(msg);
            } while (!msg.equals("dne")); // Reverse of "end"

            stk.close();
        } catch (Exception e) {
            System.out.println("Client disconnected or error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try (ServerSocket ss = new ServerSocket(2000)) {
            System.out.println("Server started on port 2000...");
            int count=1;
            while (true) {
                Socket stk = ss.accept(); // Wait for client connection
                System.out.println("client connected! "+count++);
                new MultiThreadedServer(stk).start(); // Create and start a new thread for the client
            }
        } catch (Exception e) {
            System.out.println("Server encountered an error: " + e.getMessage());
        }
    }
}
