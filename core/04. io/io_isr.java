import java.io.*;

public class io_isr {
    public static void main(String[] args) {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        // System.in is an instance of the InputStream class.
        // It provides low-level input operations, meaning it reads raw bytes of data.

        try {
            System.out.println("Enter your name: ");
            String name=in.readLine();
            System.out.println("Enter your age: ");
            int age=Integer.parseInt(in.readLine());
            System.out.println("Enter your salary: ");
            double salary=Double.parseDouble(in.readLine());
            System.out.println("Where do you live: ");
            String address=in.readLine();
            System.out.println(String.format("Name: %s, Age: %d, Salary: %.2f, Address: %s", name, age, salary, address));
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
