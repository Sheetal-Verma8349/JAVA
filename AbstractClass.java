abstract class Supplier
{
Supplier()
{
  System.out.println("** Welcome to Supplier **");  
}
void menu()
{
  System.out.println("1. Adidas");  
  System.out.println("2. Puma");  
}
abstract void billing();
abstract void offers();
}
class Shop extends Supplier
{
void billing()
{
    System.out.println("Please pay the bill");
}
void offers()
{
    System.out.println("You got the offer");
}
}
class AbstractClass
{
 public static void main(String arg[])
 {
Shop s=new Shop();
s.menu();
s.offers();
s.billing();
 }   
}