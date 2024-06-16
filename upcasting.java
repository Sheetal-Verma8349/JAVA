/*//upcasting
class Person
{
String name="Sheetal";
int id=1221;
void show()
{
    System.out.println("Your name in parent class : "+ name);
}
}
class Student extends Person
{
int id=1221;
void show()
{
System.out.println("Your name in child class : "+name);    
}
void display()
{
System.out.println("Your id is :  "+id);    
}
}
class upcasting
{
public static void main(String a[])
{
Person p=new Student();
p.show();
System.out.println(p.name);
//p.display();
System.out.println(p.id);
}
}*/
//downcasting
class Person
{
String name="Sheetal";
void show()
{
    System.out.println("Your name in parent class : "+ name);
}
}
class Student extends Person
{
int id=1221;
void display()
{
System.out.println("Your id is :  "+id);    
}
}
class upcasting
{
public static void main(String a[])
{
Person p=new Student();
Student s=(Student)p;
s.show();
System.out.println(s.name);
s.display();
System.out.println(s.id);
}
}