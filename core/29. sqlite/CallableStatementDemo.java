import java.sql.*;

public class CallableStatementDemo {
    public static void main(String[] args) throws Exception {
        // Step 1: Load the SQLite JDBC driver
        Class.forName("org.sqlite.JDBC");

        // Step 2: Establish connection to the database
        Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/univ.db");

        // There is a stored procedure named `getStudentByDept` in the database
        // with the following definition:
        // CREATE PROCEDURE getStudentByDept(IN deptNo INT)
        // BEGIN
        //     SELECT * FROM students WHERE deptno = deptNo;
        // END;

        // Step 3: Prepare the callable statement for the stored procedure
        CallableStatement callableStat = conn.prepareCall("{CALL getStudentByDept(?)}");

        // Step 4: Set input parameters for the stored procedure
        callableStat.setInt(1, 2); // Example: passing 2 as the department number

        // Step 5: Execute the callable statement
        ResultSet rs = callableStat.executeQuery();

        // Step 6: Process the result set
        while (rs.next()) {
            System.out.println("name = " + rs.getString("name"));
            System.out.println("city = " + rs.getString("city"));
            System.out.println("roll = " + rs.getInt("roll"));
        }

        // Step 7: Close resources
        rs.close();
        callableStat.close();
        conn.close();
    }
}
