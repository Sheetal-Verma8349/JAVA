import java.util.*;

class array_min_max
{
    public static void main(String args[])
    {
    int min=0,max=0,i,j;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the size of array");
  int size=sc.nextInt();
  int arr[]=new int[size];
  System.out.println("Enter "+size+" elemnt ");
  for(i=0;i<size;i++)
  {
    arr[i]=sc.nextInt();
  }
  min=arr[0];
  max=arr[0];
  for(j=0;j<size;j++)
  {
  
  if(arr[j]<min)
  {
    min=arr[j];
  }
  if(arr[j]>max)
  {
    max=arr[j];
  }
  }
  System.out.println("Minimum element is :"+min);
  System.out.println("Maximuim element is :"+max);
    }

}