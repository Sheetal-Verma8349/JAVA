//Abstraction using abstract class
abstract class Shape
{
abstract void area();
//abstract void perimeter(); 
void display()
{
System.out.println("Concrete method");
}
}
class Sqaure extends Shape
{
void area()
{
int side=5;
System.out.println("Area of Square :"+side*side);
}
}
class Rectangle extends Shape
{
void area()
{
int l=10,b=5;
System.out.println("Area of Rectangle :"+l*b);
}
}
class abstract_class
{
public static void main(String a[])
{
Sqaure s=new Sqaure();
s.area();
Rectangle r=new Rectangle();
r.area();
}
}/*if we not implement abstract method perimeter()
it will throw error*/