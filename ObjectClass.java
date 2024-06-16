/*class ObjectClass 
{
public static void main(String args[])
{

//equals() method     
ObjectClass o1=new ObjectClass();
ObjectClass o2=new ObjectClass();
ObjectClass o3=o1;
System.out.println(o1.equals(o2));
System.out.println(o1.equals(o3));

//getClass() method
Object o4=new String("sheetal");
ObjectClass o1=new ObjectClass();
System.out.println(o4.getClass());
System.out.println(o1.getName());

 
//finalize() method
ObjectClass t = new ObjectClass();
System.out.println("hello sheetal");
t = null;
// calling garbage collector
System.gc();
}
@Override protected void finalize()
{
System.out.println("session ends");
}
ObjectClass()
{
System.out.println("Session started"); 
}
}

 }}  */ 
class ObjectClass implements Cloneable
{
String name;
public static void main(String a[])
{
ObjectClass o1=new ObjectClass();
o1.name="sheetal";
System.out.println("o1 object name : "+o1.name);
try
{
    ObjectClass o2=(ObjectClass)o1.clone();
    System.out.println("o2 object name : "+o2.name);
}
catch(Exception e)
{
   System.out.println(e);  
}
}
}