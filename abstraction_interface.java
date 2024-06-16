//Abstraction using interface
interface Shape
{
   void area();//By default public and abstract
}
class Sqaure implements Shape
{
   public void area()
   {
    int side=5;
    System.out.println("Area is Square :"+side*side);
   }
}
class abstraction_interface
{
    public static void main(String args[])
    {
    Sqaure s=new Sqaure();
    s.area();
    
    }
}