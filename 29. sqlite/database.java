import java.sql.*;

class database {
    public static void main(String args[]) throws Exception {
        // Load SQLite JDBC Driver
        Class.forName("org.sqlite.JDBC");

        // Connect to the database (full path to univ.db)
        Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/univ.db");
        System.out.println("Connection established successfully!");

        // Create a statement
        Statement stat = conn.createStatement();

        // Execute the query
        ResultSet rs = stat.executeQuery("SELECT deptno, dname FROM dept");

        // Fetch and print results
        while (rs.next()) {
            int dno = rs.getInt("deptno");
            String dname = rs.getString("dname");
            System.out.println(dno + " " + dname);
        }

        // Close resources
        rs.close();
        stat.close();
        conn.close();
    }
}
