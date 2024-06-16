import java.util.*; 
class conditional_ladder_if
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);  
System.out.println("Enter your marks");
double marks=sc.nextInt();
if(marks<50)
{  
System.out.println("Fail");  
}  
else if(marks>=50 && marks<60)
{  
System.out.println("Poor Performance");  
}  
else if(marks>=60 && marks<70)
{  
System.out.println("Average");  
}  
else if(marks>=70 && marks<80)
{  
System.out.println("Good");  
}  
else if(marks>=80 && marks<90)
{  
System.out.println("Very Good");  
}
else if(marks>=90 && marks<=100)
{  
System.out.println("Excellent Performance");  
}
else
{  
System.out.println("Please enter valid marks");  
}  
}
}