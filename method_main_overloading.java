//program to demonstrat mian method overloading 
class method_main_overloading
{
    public static void main(String args[])
    {
        int a=90;
        System.out.println("hello");
        main(a);
    }
    public static void main(int a)
    {
        
        System.out.println("value of a is :"+a);
    }
}