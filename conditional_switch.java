//Menu driven program using switch case 
import java.util.*;
class conditional_switch
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("1.Addition\n2.Substraction\n3.Multiply\n4.Division");
System.out.print("Enter your choice :");
int choice=sc.nextInt();
switch(choice)
{
case 1:
{
System.out.println("Enter two numbers :");
int number1=sc.nextInt();
int number2=sc.nextInt();
System.out.println("Addition is :"+(number1+number2));
break;
}
case 2:
{
System.out.println("Enter two numbers :");
 int number1=sc.nextInt();
int number2=sc.nextInt();
System.out.println("Subtraction is :"+(number1-number2));
break;
}
case 3:
{
System.out.println("Enter two numbers :");
int number1=sc.nextInt();
int number2=sc.nextInt();
System.out.println("Multiplication is :"+(number1*number2));
break;}
case 4:
{
System.out.println("Enter two numbers :");
int number1=sc.nextInt();
int number2=sc.nextInt();
System.out.println("Division is :"+(number1%number2));
break;}
default :
{
System.out.print("Please select from above options");
}}}}