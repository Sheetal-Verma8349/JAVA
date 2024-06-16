//For each loop
import java.util.*;
class loop_for_each
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of elements :");
        int size=sc.nextInt();

        int array[]=new int[size];

        System.out.println("Enter "+size+" elements");
        for(int i=0;i<size;i++)
        {
             array[i]=sc.nextInt();
        }
        System.out.println("\n*** Array elements are :***");
        for(int element:array)
        {
             System.out.print("\n"+element);
        }}}