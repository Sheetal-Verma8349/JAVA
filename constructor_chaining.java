
class shape
{
   shape()
   {
      //base class
    System.out.println(" 1. I am shape constructor.");
   }
}
class rectangle extends shape
{
 rectangle()
   {
      //by default shape ) class constructor called because iommediate parent class of rectanglw
    //super.shape();
    System.out.println(" 2. i am rectangle constructor.");
   }
}
class sqaure extends rectangle
{
 sqaure()
 
   {//by default rectangle() class constructor called because iommediate parent class
    //super.rectangle()
    System.out.println("3 .i am sqaure constructor.");
   }   
}
class constructor_chaining
{
    public static void main(String args[])
    {
    sqaure r=new sqaure();

    }
}