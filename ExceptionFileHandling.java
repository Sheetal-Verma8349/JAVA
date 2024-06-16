import java.io.*;
import java.util.*;
class ExceptionFileHandling
{
    static FileInputStream f;
    static Scanner sc;
    static void Divide() throws FileNotFoundException
    {try{
        f=new FileInputStream("text.txt");
        sc=new Scanner(f);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(a/b);
    }
    finally
    {
        f.close();
        sc.close();
    }
    }
 public static void main(String a[])throws Exception
 {
    try{
Divide();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
int x=sc.nextInt();
System.out.println(x);
 }
}