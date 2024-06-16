class Super_class
{
    void super_method(){
    System.out.println("Super class method");}
}
class Sub_class extends Super_class
{
    @Override
    void super_method()
    {
    System.out.println("Super class method overriden in sub class");
    }
    void sub_method()
    {System.out.println("Sub class method");}
}
class dynamic_method
{
    public static void main(String a[])
    {
       Super_class reference=new Sub_class();
       reference.super_method();
       //reference.sub_method();error
    }
}