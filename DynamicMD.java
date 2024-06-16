class Figure
{
    int dim1;
    int dim2;
    Figure()
    {
System.out.println("** Calculating area **");
    }
    void area()
    {
System.out.println("Area method");
    }
}
class Rectangle extends Figure
{
Rectangle(int d1,int d2)
{
dim1=d1;
dim2=d2;
}
void area()
{
System.out.println("Area of rectangle is :"+dim1*dim2);
}
}
class Triangle extends Figure
{
Triangle(int b,int h)
{
dim1=b;
dim2=h;
}
void area()
{
System.out.println("Area of triangle is :"+(0.5*dim1*dim2));    
}
}
class DynamicMD
{
    public static void main(String a[])
    {
   Figure f1=new Rectangle(20,10);
   f1.area();
   Figure f2=new Triangle(40,10);
   f2.area();
    }
}