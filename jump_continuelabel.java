//Labeled continue statement
//This program is just for understanding
class jump_continuelabel
{
public static void main(String args[])
{
outerloop:for(int i=1;i<5;i++)
{
System.out.println("\nOuter loop :"+i);
innerloop:for(int j=1;j<10;j++)
{
if(j==5)
{
System.out.println("\nGo to outer loop");
continue outerloop;    
}
System.out.println("inner loop : "+j);
/*
continue;
if we write normal continue statement it will 
continue with the nearest innerloop.
But if wants to continue with outerloop,use label with 
continue statement
*/}}}}