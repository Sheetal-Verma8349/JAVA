class Student
{
    String name;
    int password;
    Student()
    {
    name="Strudent";
    password=123;
    }
    Student(String s,int a)
    {
    name=s;
    password=a;
    }
    void show(int i)
    {
        System.out.println("Student :"+ i);
        System.out.println("Your name is :"+name);
        System.out.println("Your password is :"+password);
    }
}
class constructor_overloading
{
    public static void main(String arg[])
    {
    Student s1=new Student();
    s1.show(0);
    Student s2=new Student("Sheetal",25);
    s2.show(1);
    }
}