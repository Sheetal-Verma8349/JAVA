//finding a number is octal,decimal,hexadecimal
import java.util.*;
class Radix
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    String number;
    System.out.println("Enter a Number");
    number=sc.nextLine();
    if(number.matches("[01]+"))
    {
        System.out.println("Binary Radix=2");
    }
    else if(number.matches("[0-7]+"))
        {
            System.out.println("Octal Radix 8");
        }
        else if(number.matches("[0-9]+"))
        {
            System.out.println("Decimal Radix 10");
        }
        else if(number.matches("[0-9A-F]+"))
        {
            System.out.println("Hexa Decimal Radix 16");
        }
        else
        {
            System.out.println("Invalid number");
        }
        
   
    
    
    }
}