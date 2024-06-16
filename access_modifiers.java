
class Superclass
{
    public int Public=10;
    private int Private=20;
    protected int Protected=30;
    int Default=40;
    public void display()
    {
        System.out.println(Public);
        System.out.println(Private);
        System.out.println(Protected);
        System.out.println(Default);

    }
   
}
class Subclass extends Superclass
{
       public void display()
    {
        System.out.println(Public);
        System.out.println(Private);
        System.out.println(Protected);
        System.out.println(Default);

    }

}
class access_modifiers
{
    public static void main(String arg[])
    {
   Subclass s=new Subclass();
   s.display();

    } 
}