interface interface1
{
    void method1();
}
interface interface2 extends interface1
{
    void method2();
}
class class1 implements interface2
{
   public  void method2()
    {
System.out.println("method2");
    }
     public  void method1()
    {
System.out.println("method1");
    }
}
class interfaceInheritance
{
    public static void main(String a[])
    {
        class1 c=new class1();
        c.method2();
    }
}