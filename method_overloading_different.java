//Method overloading in different classes 
class Super_class
{
    void display()
    {
        System.out.println("hello");
    }
}
class Sub_class extends Super_class
{
    
    void display(String name)
    {
        System.out.println("hello "+name);
    }
}
class method_overloading_different
{
    public static void main(String args[])
    {
   Sub_class r=new Sub_class();
   r.display();
   r.display("sheetal verma");
    }
}