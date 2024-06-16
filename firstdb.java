import java.sql.*;
public class firstdb
{
public static void main(String args[]) throws Throwable
    {
        //try
        //{
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//first.db");
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
      /* catch(Throwable e)
       {
        System.out.println("heuu");
       }
       */
    }