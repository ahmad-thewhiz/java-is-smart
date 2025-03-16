import java.sql.*;
import java.util.Scanner;

public class DMLDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");

        Connection conn=DriverManager.getConnection("jdbc:sqlite:C:/sqlite/univ.db");
        
        Statement stat=conn.createStatement();

        // stat.executeUpdate("insert into dept values (60, 'Chem')");

        // stat.executeUpdate("delete from dept where deptno>=50");

        // stat.executeUpdate("update dept set dname='Chemistry' where deptno=40");

        PreparedStatement pstat=conn.prepareStatement("insert into dept values (?, ?)");

        Scanner in=new Scanner(System.in);
        System.out.print("Enter deptno: ");
        int deptno=in.nextInt();
        System.out.print("Enter dname: ");
        String dname=in.next();

        pstat.setInt(1, deptno);
        pstat.setString(2, dname);
        pstat.executeUpdate();
        
        stat.close();
        conn.close();
    }
}
