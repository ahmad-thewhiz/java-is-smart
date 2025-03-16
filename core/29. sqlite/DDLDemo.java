import java.sql.*;

public class DDLDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");

        Connection conn=DriverManager.getConnection("jdbc:sqlite:C:/sqlite/univ.db");
        
        Statement stat=conn.createStatement();

        stat.executeUpdate("drop table if exists Temp;");

        stat.executeUpdate("create table Temp(name text, city text, roll int);");

        stat.close();
        conn.close();
    }

}
