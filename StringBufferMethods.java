class StringBufferMethods
{
public static void main(String args[])
{  
//append() method 
System.out.println("\n1. append()");
StringBuffer s1=new StringBuffer("Sheetal ");
StringBuffer s2=new StringBuffer("Verma");
s1=s1.append(s2);
System.out.println("After appending Verma with Sheetal :"); 
System.out.println("New String in s1 :"+s1);

//appendCodePoint() method
System.out.println("\n2. appendCodePoint()");
StringBuffer s3=new StringBuffer("abc"); 
s3=s3.appendCodePoint(100);
System.out.println("Adding 100='d' at the end abc : "+s3); 

//capacity() method
System.out.println("\n3. capacity()");
StringBuffer s4=new StringBuffer();
int capacity=s4.capacity();
System.out.println("Default capacity of string s4 :"+capacity); 
s4=s4.append("My name is sheetal verma ");
System.out.println("After appending 'My name is sheetal verma':");
System.out.println("New Capacity : "+s4.capacity());

//charAt()
System.out.println("\n4. charAt()");
StringBuffer s5=new StringBuffer("Sheetal");
char c=s5.charAt(0);
System.out.println("Character at 0th index in 'Sheetal' is : "+c);

//deleteCharAt()
System.out.println("\n5. deleteCharAt()");
StringBuffer s6=new StringBuffer("Java programming");
s6=s6.deleteCharAt(3);
System.out.println("After deleting character at index 3 in 'Java programming' :"+s6);
StringBuffer s7=new StringBuffer("World");
s7.setCharAt(0,'w');
System.out.println("After adding 'w' at index 0 in 'World' :"+s7);

//reverse()
System.out.println("\n6. reverse()");
StringBuffer s8=new StringBuffer("sheetal");
System.out.println("After Reversing 'sheetal ': "+s8.reverse());

//length()
System.out.println("\n7.length()");
StringBuffer s9=new StringBuffer("JAVA LANGUAGE");
System.out.println("Length of 'JAVA LANGUAGE' : "+s9.length());

//indexOf()
System.out.println("\n8. indexOf()");
StringBuffer s10=new StringBuffer("Hello sheetal sheetal");
System.out.println("Index of 'sheetalfd 'in Hello sheetal sheetal : "+s10.indexOf("sheetalfd"));
System.out.println("Index of 'sheetal' in Hello sheetal sheetal : "+s10.indexOf("sheetal"));
//lastIndexOf()
System.out.println("\n9. lastIndexOf()");
System.out.println("last index of 'sheetal' in 'hello sheetal sheetal ' : "+s10.lastIndexOf("sheetal"));

//substring ()
System.out.println("\n10. substring()");
StringBuffer s11=new StringBuffer("hey sheetal verma");
String s12=s11.substring(0,3);
System.out.println("substring from 0 to 3 in  'hey sheetal verma ' is :"+s12);

//insert()
System.out.println("\n 11. insert()");
StringBuffer s16=new  StringBuffer("Sheetal");
s16=s16.insert(0,"Hey ");
System.out.println("After inserting hey at 0th index in 'Sheetal' ");
System.out.println("New string is : "+s16);
StringBuffer s17=new StringBuffer(" Age=25");s16=s16.insert(11,s17);
System.out.println("After inserting age=25 at 11th index in 'Hey Sheetal' ");
System.out.println("New string is : "+s16);

//delete()
System.out.println("\n 12. delete()");
StringBuffer s13=new StringBuffer("123456789");
s13=s13.delete(0,3);
System.out.println("After deleting characters from 0 to 3 in '123456789' : ");
System.out.println("New string is :"+s13);

//deleteCharAt()
System.out.println("\n 13. deleteCharAt()");
StringBuffer s14=new StringBuffer("ABCDEFG");
s14=s14.deleteCharAt(4);
System.out.println("After deleting charter at index 4 in ABCDEFG new string is :"+s14);

//ensureCapacity()
System.out.println("\n 14. ensureCapacity()");
StringBuffer s15= new StringBuffer();
System.out.println("Previous capacity : "+s15.capacity());
s15.ensureCapacity(18);
System.out.println("Ensured capacity :"+s15.capacity());
}
}