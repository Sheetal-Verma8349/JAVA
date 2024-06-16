/*Task is to check whether riya is younger 
than tiya and jiya .
//using nested "if"*/
class conditional_nested_if
{
public static void main(String args[])
{
int riya=10,jiya=15,tiya=40;
//case 1: Using "if-else"
if(riya>jiya)
{
System.out.println("riya is not younger");
}
else
{
if(riya<tiya)
{
System.out.println("riya is younger than tiya and jiya"); 
}
}




/*case 2: Using only "if"
if(riya<jiya)
{
if(riya<tiya)
{
System.out.println("riya is younger than jiya and tiya"); 
}
} */

}
}