import java.sql.*;

import javax.naming.spi.DirStateFactory.Result;

public class database2 {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");

        Connection conn=DriverManager.getConnection("jdbc:sqlite:C:/sqlite/univ.db");
        
        Statement stat=conn.createStatement();

        ResultSet rs=stat.executeQuery("select * from students");
        
        while(rs.next()){
            System.out.println("name = "+rs.getString("name"));
            System.out.println("dept = "+rs.getString("city"));
            System.out.println("roll = "+rs.getInt("roll"));
        }

        rs.close();
        conn.close();
        stat.close();
    }
}
