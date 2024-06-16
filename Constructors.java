
class ParameterizedConstructors
{
String name;
int password;
//ParameterizedConstructors   
ParameterizedConstructors(String s,int p)
{
name=s;
password=p;    
System.out.println("\nYour name : "+name);
System.out.println("\nYour password : "+password);   
}
//Copyconstructor in class 
ParameterizedConstructors(ParameterizedConstructors c)
{
name=c.name;
password=c.password;    
System.out.println("\nCopied name : "+name);
System.out.println("\nCopied password : "+password);}
}
class Constructors
{
public static void main(String arg[])
{
ParameterizedConstructors p=new ParameterizedConstructors("Sheetal",999999);
new ParameterizedConstructors(p);
}}