import java.util.*;
import java.sql.*;
class jump_break
{
public static void main(String args[]) throws Exception
{
    Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:first.db");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from department ");
    
       int dno;
       String dname;
       while(rs.next())
       {
        dno=rs.getInt("deptno");
        dname=rs.getString("dname");
        System.out.println(dno+" "+dname);
       }
    
}
}