class ConversionAndCastingDemo
{
public static void main(String a[])
{
System.out.println("\n\n         ****    Type conversion    ****       ");
System.out.println("Type conversion is also known as widening and down type casting");
System.out.println("It is used to convert lower data types itno higher data types");
System.out.println("It is done automatically");

System.out.println("\n1. Byte to int");
byte b1=25;
int i1=b1;
System.out.println("value of byte as byte "+b1);
System.out.println("value of  byte as int "+i1);

System.out.println("\n2. char to int");
char c1='a';
int unicode=c1;
System.out.println("value of character as char "+c1);
System.out.println("value of character as int "+unicode);

System.out.println("\n3. Float to double");
float f1=25.123456f;
double d1=f1;
System.out.println("value of float as float "+f1);
System.out.println("value of float as double "+d1);

System.out.println("\n4. Long to flaot ");
long l1=12343567891234656l;
float f2=l1;
System.out.println("value of long as long "+l1);
System.out.println("value of long as float "+f2);

System.out.println("\n\n****    Type casting    ****");
System.out.println("Type conversion is also known as narrowing and up type casting");
System.out.println("It is used to convert higher data types into lower data types");
System.out.println("It is explicitly done by programmer");

System.out.println("\n1. Double to long");
double d2 = 16666666666.6665;  
System.out.println("value of Double as double "+d2); 
long l2 = (long)d2; 
System.out.println("value of double as long "+l2);   
System.out.println("\n1.long to int ");
int i2 = (int)l2;    
System.out.println("value of long as int "+i2);  
}}

