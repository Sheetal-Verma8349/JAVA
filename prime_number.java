import java.util.*;
class prime_number
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number :");
       int number=sc.nextInt(); 
       prime(number);
    }
    static int prime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
        if(n%i==0)
        {
        System.out.print("Not a Prime Number");
        return 0;
        }
        }
        
         System.out.print("Prime Number");
         return 0;


    }
}