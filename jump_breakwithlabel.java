class jump_breakwithlabel
{
public static void main(String args[])
{
outerloop:for(int i=1;i<10;i++)
{
innerloop:for(int j=1;j<10;j++)
{
System.out.println(j);
if(j==5)
/*
break;
if we write normal break statement it will only
comes out of innerloop and outerloop will 
excute normally.
But if wants to terminate both loops then used 
break with label.
*/
break outerloop;
}
}
}
} 