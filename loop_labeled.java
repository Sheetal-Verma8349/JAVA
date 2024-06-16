//Printing table from 1 to 5
//labled loops
class loop_labeled
{
public static void main(String agrs[])
{
outerloop:for(int i=1;i<=5;i++)
{
System.out.println("\nTable of :"+i);

innerloop:for(int j=1;j<=10;j++)
{
System.out.println(i+" * "+j +" = "+(i*j));  
}
System.out.println(" ");
}
}
}