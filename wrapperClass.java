class wrapperClass
{
public static void main(String a[])
{
//autoboxing    
int age1=25;
int age2=30;
Integer o1=Integer.valueOf(age1);
Integer o2=age2;//compline will automatically convert
System.out.println("primitive to object "+o1);
System.out.println("primitive to object "+o2);

//unboxing
Integer o3=new Integer(40);
Integer o4=new Integer(50);
int n1=o3.intValue();
int n2=o4;
System.out.println("object to primitive "+n1);
System.out.println("object to primitive "+n2);
}
}