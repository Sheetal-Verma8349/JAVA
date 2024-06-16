//Multi-level Inheritance
class Person
{
    String Name;
    String  city;
    
void details()
{
System.out.println("Your details are");
}
}
class Student extends Person
{
    int id;
void filldetails(int i,String n,String c)
{
id=i;
Name=n;
city=c;
}
void showDetails()
{
    System.out.println("Student name is :"+Name);
     System.out.println("Enrollment no.:"+id);
}
}
class CR extends Student
{
void code()
{
System.out.println("Class Reprentative");
}
}
class inheritance_multilevel
{
public static void main(String args[])
{
Student s=new Student();
s.filldetails(111,"sheetal","Indore");
s.showDetails();
CR c=new CR();
c.code();
}
}
/*Here we can inherit all the 
properties and methods 
of superclasses and using last derived
 class reference 
we can access all above class members.
*/