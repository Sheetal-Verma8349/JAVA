class StringBufferConstructors
{
public static void main(String a[])
{
    
//StringBuffer()
StringBuffer s1=new StringBuffer();
System.out.println(s1.length()); 
 System.out.println(s1.capacity()); 

 //StringBuffer(int capacity)
StringBuffer s2=new StringBuffer(20);
System.out.println(s2.capacity()); 

//StringBuffer(String ))
StringBuffer s3=new StringBuffer("sheetal");
System.out.println(s3); 
}
}