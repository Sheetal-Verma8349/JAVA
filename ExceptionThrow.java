import java.util.Scanner;
class InvalidAge extends RuntimeException
{
    InvalidAge(String msg)
    {
        super(msg);
    }
}
class ExceptionThrow
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter your age");
        int age=sc.nextInt();
        try{
     if(age<18)
     {
        throw new InvalidAge("You are not eligible");
     }
     else
     {
        System.out.println("you are eligible");
     }
        }
        catch(InvalidAge e)
        {
   e.printStackTrace();
        }
    }
}