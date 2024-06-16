
class Sports
{
void fees()
{
System.out.println("***You have to pay ***");
}
}

class Cricket extends Sports
{
void fees()
{
System.out.println("For cricket fees is : 10,000");
}
}
class Football extends Sports
{
void fees()
{
System.out.println("For football fees is : 20,000");
}
}
class sports_inheritance
{
public static void main(String args[])
{
Sports s=new Sports();
s.fees();    
Cricket c=new Cricket();
c.fees();
Football f=new Football();  
f.fees();
}
}

