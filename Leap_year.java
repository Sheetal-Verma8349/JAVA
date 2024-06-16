import java.util.*;
class Leap_year
{
    public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    int year;
    System.out.println("Enter a Year");
    year=sc.nextInt();
    if(year%4==0)
    {
    if(year%100==0)
    {
        if(year%400==0)
        {
          System.out.println(" Leap Year");   
        }
        else{
       System.out.println("Not a Leap Year"); 
    }
    }else
    {
          System.out.println(" Leap Year");   
        }

   }
   else
   {
       System.out.println("Not a Leap Year"); 
    }
   }}
/*
case 1:
if a year is divisible by 4 and is also divisible by 100 then it must be 
divisible by 400.
case 2:
if a year is divisible by 4 and is not divisible by 100 then it is a leap
year.  
:-here we divide by 400 and 100 for century years because some
century years are divisible by 4 but they are not leap years.
example :
1700
1700 divisible by 4 but it is not leap year
here 1700 also divible by 100 but still it is not a leap year
so check is 1700 divisible by 400 here not so 1700 is not a leap year
just apply for :- 1996 1700 2000   
 */