import java.util.Scanner;
interface Website
{
    void register();
    void showDetails();
}
class Developing implements Website
{
    Scanner sc=new Scanner(System.in);
     String name;
     int age;
    public void register()
    {
       
        System.out.print("Enter your name : ");
     name=sc.nextLine();
      System.out.print("Enter your age : ");
     age=sc.nextInt();
    }
    public void showDetails()
    { 
         System.out.println("Your registration details are : ");
        System.out.println("Your name is : "+name);
         System.out.println("Your age is : "+age);

    }
}
class Interfaces{
    public static void main(String a[])
    {
        Developing d=new Developing();
        d.register();
        d.showDetails();
    }
}