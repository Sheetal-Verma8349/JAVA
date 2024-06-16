class Grand_father
{
void grandFather()
{
System.out.println("Grand Father");
}
}
class Father
{
void father()
{
System.out.println("Father");
}}
class Son extends Father
{
void son()
{
System.out.println("Son");
}
}
class Daughter extends Father
{
void daughter()
{
System.out.println("Daughter");
}
}
class inheritance_hybrid
{
public static void main(String args[])
{
Daughter d=new Daughter();
d.daughter();
d.father();

}
}