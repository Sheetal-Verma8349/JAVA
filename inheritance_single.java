//Single level Inheritance
class Super_class
{
    void super_method()
    {
        System.out.println("Super class method");
    }
}
class Sub_class extends Super_class
{
 void sub_method()
    {
        System.out.println("Sub class method");
    }
}
class inheritance_single
{
    public static void main(String args[])
    {
    Sub_class reference=new Sub_class();
    reference.sub_method();
    reference.super_method();
    }
}