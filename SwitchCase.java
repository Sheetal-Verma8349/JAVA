import java.util.*;
class SwitchCase
{
    public static void main(String arg[])
    {
        System.out.print("Enter your choice : ");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                {
                System.out.println(" 1. JANUARY");
                break;
                }
                case 2:
                {
                System.out.println(" 2. FEBRUARY");
                break;
                }
                case 3:
                {
                System.out.println(" 3. MARCH");
                break;
                }
                case 4:
                {
                System.out.println(" 4. APRIL");
                break;
                }
                case 5:
                {
                System.out.println(" 5. MAY");
                break;
                }
                case 6:
                {
                System.out.println(" 6. JUNE");
                break;
                }

                case 7:
                {
                System.out.println(" 7. JULY");
                break;
                }
                case 8:
                {
                System.out.println(" 8. AUGUST");
                break;
                }
                case 9:
                {
                System.out.println("9. SEPTEMBER");
                break;
                }
                case 10:
                {
                System.out.println(" 10. OCTOMBER");
                break;
                }
                case 11:
                {
                System.out.println(" 11. NOVEMBER");
                break;
                }
                case 12:
                {
                System.out.println(" 12. DECEMBER");
                break;
                }
                default :
                System.out.println("Please Enter number between 1 to 12");
                
        }
    }
}