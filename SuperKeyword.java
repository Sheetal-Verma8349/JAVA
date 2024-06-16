
//parent class variables
class Parent
{
String surname="verma";
void show()
{
  System.out.println("maritial Status: ");   
}
}
class Daughter extends Parent
{
Daughter()
{
    super.show();
}
String surname="sharma";
void maritialStatus()
{
    System.out.println("After marriage surnmae: "+surname);
    System.out.println("Before marriage surname: "+super.surname);
}
}
class SuperKeyword
{
    public static void main(String a[])
    {
Daughter d=new Daughter();
d.maritialStatus();
    }
}/*
class ParentClass
{
ParentClass(String s)
{
  System.out.println(s); 
  System.out.println("Super class cons.");  
}

}
class childClass extends ParentClass
{
childClass()
{
    //by default super();
    super("Sheetal");
  System.out.println("Sub class cons.");  
}

}
class SuperKeyword
{
    public static void main(String a[])
    {
childClass c=new childClass();

    }}*/