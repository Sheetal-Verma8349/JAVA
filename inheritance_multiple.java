//Multiple inheritance
interface interface1
{
void interface1_method1();
}
interface interface2
{
void interface2_method2();
}
class Sub_class implements interface1,interface2
{
public void interface1_method1()
{
System.out.println("interface 1 method");
}
public void interface2_method2()
{
System.out.println("interface 2 method");
}
public void sub_class_method()
{
System.out.println("sub class method");
}
}
class inheritance_multiple
{
public static void main(String a[])
{
Sub_class reference=new Sub_class();
reference.interface1_method1();
reference.interface2_method2();
reference.sub_class_method();
}
}