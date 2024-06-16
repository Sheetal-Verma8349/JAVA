import java.util.*;
class array_1D
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        /*System.out.print("Enter number of elements :");
        int size=sc.nextInt();

        int array[]=new int[size];

        System.out.println("Enter "+size+" elements");
        for(int i=0;i<size;i++)
        {
             array[i]=sc.nextInt();
        }

        System.out.println("*** 1D array ***");
        for(int i=0;i<size;i++)
        {
             System.out.print(array[i]+" ");
        }*/
        System.out.println("Enter 7 week days name  :");
         String week[]=new String[12];
         for(int i=0;i<7;i++)
        {
          week[i]=sc.next();
        }
System.out.println("***week names using 1D array ***");
        for(int i=0;i<7;i++)
        {
             System.out.println("Day "+(i+1) +" " +week[i]);
        }
        }}