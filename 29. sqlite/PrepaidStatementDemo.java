import java.sql.*;
import java.util.Scanner;

public class PrepaidStatementDemo {
    public static void main(String[] args) {
        try {
            // Step 1: Load the SQLite JDBC driver
            Class.forName("org.sqlite.JDBC");

            // Step 2: Establish the database connection
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/univ.db");

            // Step 3: Prepare the SQL query with a placeholder
            PreparedStatement stat = conn.prepareStatement("SELECT * FROM students WHERE name = ?");

            // Step 4: Take input for the department number
            Scanner in = new Scanner(System.in);
            System.out.println("Enter name: ");
            String name = in.nextLine();

            // Step 5: Set the parameter in the prepared statement
            stat.setString(1, name);

            // Step 6: Execute the query
            ResultSet rs = stat.executeQuery();

            // Step 7: Process the result set
            while (rs.next()) {
                System.out.println("name = " + rs.getString("name"));
                System.out.println("city = " + rs.getString("city"));
                System.out.println("roll = " + rs.getInt("roll"));
            }

            // Step 8: Close resources
            rs.close();
            stat.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
