class superClass
{
    superClass()
    {
        System.out.println("super class constructor");
    }
}
class subClass extends superClass
{
    subClass()
    {
        //super(); By Default
        this(100);
        System.out.println("sub class constructor");
    }
    subClass(int a)
    {
         System.out.println("sub class parameterized constructor");
    }
    
}
class constructorChaining
{
    public static void main(String arg[])
    {
        subClass s=new subClass();

    }
}