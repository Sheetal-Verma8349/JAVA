import java.io.*;
class string_constructors
{
public static void main(String a[])
{
//Default constructor
String s1=new String();
System.out.println(s1.length());

//Passsing another string into constructor
String s2=new String("Sheetal");
System.out.println(s2);  

//String constructor taking byte array
byte arr[]={'a','b','c'};
String s3=new String(arr);   
System.out.println(s3);

byte array[]={97,98,99};
String s4=new String(array);     
System.out.println(s4);

/*import java.io.UnsupportedEncodingException;
public class string_constructors
{
   public static void main(String[] args) throws UnsupportedEncodingException 
   {
      byte[] bytes = {96,97,98,99}; 
      String s5= new String(bytes, "UTF-8");
      System.out.println(s5);
   }
}*/

//with start and end index
byte aa[]={'a','b','c','d'};
String s6=new String(aa,1,3);
System.out.println(s6);

//char array to string
char[] charArray = {'H', 'e', 'l', 'l', 'o'};
String s7 = new String(charArray);
System.out.println(s7);

//integer array
int[] codePoints = {97,98,99,100}; 
String s8 = new String(codePoints, 0, codePoints.length);
System.out.println(s8);

//string buffer

StringBuffer s9= new StringBuffer("Hello sheetal");
String s10= new String(s9);
System.out.println(s10);

StringBuilder s12= new StringBuilder("sheetal");
String s11= new String(s12);

System.out.println(s11);
}
}
