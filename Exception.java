class Exception
{
    public static void main(String arg[])
    {
        int a=10;
        int b=0;
        try
        {
            int c=a/b;
            System.out.println("division is :"+c);
        }
        catch(ArithmeticException e)
        {
 System.out.println("Divide by zero error");
        }
        finally
        {
        System.out.println("Bye");    
        }
    }
}