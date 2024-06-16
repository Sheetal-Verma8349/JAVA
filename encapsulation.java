//Encapsulation using class
class Password_class
{
private int password;//data hiding
void setPassword(int pass)//abstraction
{
password=pass;
}
int getPassword()
{
return password;
}
}
class encapsulation
{
public static void main(String args[])
{
Password_class p=new Password_class();
/*compile time error
p.password=100021;
System.out.println(p.password);*/
p.setPassword(100021);
System.out.println("Your password is "+p.getPassword());
}}