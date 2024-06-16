class A
{  
void display()
{
    System.out.println("super class 1 method");
}  
}  
class B
{  
void display()
{
    System.out.println("super class 2 method");
}  
}  
class C extends A,B
{ 

    void sub_class()
    {
    System.out.println("child class method");
    }
     
 
}  
class diamond_problem
{
   public static void main(String args[])
   {  
   C obj=new C();  
   obj.display();
   }  
}