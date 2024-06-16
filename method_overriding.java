
/*Method Overriding
Runtime Polymorphism*/
class Book
{
String name;
void colors()
{
    System.out.println("Colors depend on book subject");
}
}
class Maths extends Book
{
@Override
void colors()
{
    System.out.println("** For Maths **");   
System.out.println("Maximum 4 colors are needed Pink,Black,Yellow ,Green");
}
}
class method_overriding
{
public static void main(String a[])
{
Book b=new Book();
b.colors();    
Maths m=new Maths();
m.colors();
}
}
/*here we have same super_method() but
with different implementation.*/