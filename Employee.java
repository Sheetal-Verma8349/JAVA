import java.util.*;
class Employee
{
    Scanner sc=new Scanner(System.in);
    int empId;
    String name=new String();
    void getData()
    {
        System.out.print("\nEnter ID : ");
        empId=sc.nextInt();
        System.out.print("\nEnter Name : ");
        name=sc.nextLine();
    }
    void display()
    {
        System.out.println("\nYour name is :"+ name);
        System.out.println("\nYour ID is :"+ empId);
    }
    public static void main(String a[])
    {
        Employee e=new Employee();
        e.getData();
        e.display();
    }}