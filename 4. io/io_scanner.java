import java.util.Scanner; // for Scanner class

public class io_scanner {
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=in.nextLine();
        System.out.println("Enter your age: ");
        int age=in.nextInt();
        // int age=Integer.parseInt(in.nextLine());
        System.out.println("Enter your salary: ");
        double salary=in.nextDouble();
        // double salary=Double.parseDouble(in.nextLine());
        System.out.println("Where do you live: ");
        // Consume the leftover newline character, after nextDouble() method, before calling nextLine() method
        in.nextLine(); 
        String address=in.nextLine();
        // it will not wait for user input for address, it will take it as empty string because of the nextDouble() method above 
        // Explanation:
        // When you call in.nextInt() or in.nextDouble(), these methods only consume the numerical input (like the number itself), but they do not consume the newline character (\n) that the user presses after entering the number.
        // So, when you subsequently call in.nextLine(), it reads the remaining newline character (\n) left in the input buffer, and as a result, you get an empty string instead of the intended input for the address.
        in.close();
        // after using scanner, we need to close it to avoid memory leak
        System.out.println(String.format("Name: %s, Age: %d, Salary: %.2f, Address: %s", name, age, salary, address));
    }
}
