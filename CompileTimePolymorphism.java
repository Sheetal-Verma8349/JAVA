
class MethodOverloading
{
 void area(double r)   
 {
    double pi=3.14;
    System.out.println("** Area of Square **");
    System.out.println(pi*r*r);
 }
 void area(double l,double b)
 {
   System.out.println("** Area of Rectangle **");
    System.out.println(l*b); 
 }
  void area(double l,double b,double h)
 {
   System.out.println("** Area of Cubeoid **");
    System.out.println(l*b*h); 
 }
}
class CompileTimePolymorphism
{
public static void main(String args[])
{
MethodOverloading a=new MethodOverloading();
a.area(14);
a.area(20,10);
a.area(10,5,4);
}
}