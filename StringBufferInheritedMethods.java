class StringBufferInheritedMethods
{
public static void main(String arg[])
{
//hashCode() method
System.out.println("\n 1. hashCode()");
StringBuffer s1 = new StringBuffer("Sheetal");
StringBuffer s2 = new StringBuffer("Sheetal");
StringBuffer s3=s1;
int s3hash=s3.hashCode();
int s1hash=s1.hashCode();
//"here s1 and s3 holding same object 'Sheetal'"
//"So the hashcode of string inside them is same"
System.out.println("hash code of s1='Sheetal' is : "+s1hash);
System.out.println("hash code of s3='Sheetal' is : "+s3hash);

//equals() method
System.out.println("\n 2. equals()");
System.out.println("Comparing s3='Sheetal' and s1='Sheetal' using equals method "+s3.equals(s1));
System.out.println("Comparing s3='Sheetal'and s1='Sheetal' using == operator "+(s1==s3));
//return false because the hash code value is different
//System.out.println(s1.equals(s2));
 
//toString method
System.out.println("\n 3. toString()");
StringBuffer s4 = new StringBuffer("12345");
System.out.println("Before appling toString method '12345' belongs to :"+s4.getClass());
String s5=s4.toString();
System.out.println("After appling toString method '12345' belongs to :"+s5.getClass());

//getclass() method
System.out.println("\n 3. getClass()");
StringBuffer s6=new StringBuffer("sheetal");
System.out.println("The object 'sheetal' belongs to : "+s6.getClass());
StringBufferInheritedMethods s7=new StringBufferInheritedMethods();
System.out.println("The object in s7 belongs to : "+s7.getClass());
String s8="s";
System.out.println("String s8= 's' belongs to : "+s8.getClass());
}    
}