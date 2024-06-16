class StarPattern
{
public static void main(String arg[])
{
int j=0,a=0,space1=8,s1=0,s2=0,space2=4;
for(int i=1;i<=11;i=i+2)
{
if(i==11)
{
for(int k=7;k>=1;k=k-2)
{
a=k;
s2=space2;
System.out.println("\n");   
while(a>0) 
{
while(s2>=1) 
{
System.out.print(" ");  
s2=s2-1; 
}
System.out.print("*");
a=a-1;
}
space2=space2+1;
}
break;
}
j=i;
s1=space1;
System.out.println("\n");   
while(j>0)   
{
while(s1>1) 
{
System.out.print(" ");  
s1=s1-1; 
}  
System.out.print("*");
j=j-1;
}
space1=space1-1;
}
}
}