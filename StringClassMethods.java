class StringClassMethods
{
public static void main(String args[])
{
    System.out.println("\n\n ***  OUTPUT   ***");
//charAt(index)
System.out.println("\n 1.CharAt() method");
String s1="Sheetal Verma";
char ch=s1.charAt(0);
System.out.println("Character at 0 th index in 'Sheetal Verma' "+ch);

//length()
System.out.println("\n2.length() method");
int length=s1.length();
System.out.println("Length of Sheetal Verma is : "+length);

//substring(index)
System.out.println("\n3.substring method");
String s2=s1.substring(2);
System.out.println("Substring from index (2 to end) in Sheetal Verma : "+s2);
String s3=s1.substring(0,5);
System.out.println("Substring from index (0 to 4)index Sheetal Verma : "+s3);

//contain() 
System.out.println("\n4.contains() methods"); 
boolean b= s1.contains("sheetal");  
System.out.println("Is 'Sheetal Verma' contain 'sheetal' : " +b);    
System.out.println("Is 'Sheetal Verma' contain 'Sheetal' : "+s1.contains("Sheetal"));  

//replace()
System.out.println("\n5.replace() methods");
String s6="sheetal verma";
String s5=s6.replace('e','i'); 
System.out.println("After replacing 'e' with 'i' in 'sheetal verma' "+s5); 
String s7="My name was Sheetal ";  
String s8=s7.replace("was","is");  
System.out.println("After replacing 'was' with 'is' in 'My name was Sheetal '"); 
System.out.println("New string : "+s8);

//concat()
System.out.println("\n6.concat() methods");
String Name="Sheetal";  String surname=" Verma"; String father=" Tarachand";
String fullname=Name.concat(surname);
System.out.println("After concating 'Sheetal' and 'Verma' : "+fullname); 
String completeName = Name.concat(father).concat(surname); 
System.out.println("After concating Sheetal and Verma and Tarachand  "+completeName); 

//indexof()
System.out.println("\n7.indexof() methods");
String line="Hello everyone sheetal verma Hello";
//int index=line.indexOf(97);//ascii of 'a'
int index=line.indexOf('e');
System.out.println("index of 'e ' in 'Hello everyone sheetal verma hello '"+index);

int index1=line.indexOf('e',5);
System.out.println("index of 'e ' in 'Hello everyone sheetal verma hello ' after index 5 is :"+index1);

int index2=line.indexOf("Hello");
System.out.println("index of 'Hello' in 'Hello everyone sheetal verma hello '"+index2);

int index5=line.indexOf("Helloo");
System.out.println("index of 'Helloo' in 'Hello everyone sheetal verma hello '"+index5);

int index3=line.indexOf("hello");
System.out.println("index of 'hello' in 'Hello everyone sheetal verma hello ' "+index3);

int index4=line.indexOf("Hello",20);
System.out.println("index of 'Hello' in 'Hello everyone sheetal verma hello ' after index 20 is :"+index4);

//toupperCase
System.out.println("\n8.toUpperCase() methods");
String ss="Sheetal VERMA";
System.out.println("Sheetal VERMA in upper case :"+ss.toUpperCase());
System.out.println("Sheetal VERMA in lower case :"+ss.toLowerCase());
//trim()
System.out.println("\n9.trim() methods");
String t="  Hello Sheetal Verma  ";
System.out.println("Before trim() method");
System.out.println(t);
System.out.println("After trim() method");
System.out.println(t.trim());

//valueOf()
System.out.println("\n10.valueOf() methods");
int i=20,j=40;
System.out.println("When i is integer i+j=60");
System.out.println(i+j);
System.out.println("when we convert i in string i+j=2040");
System.out.println(String.valueOf(i)+j);//now i become string 
System.out.println("Array to string");
char arr[]={'j','a','v','a'};  
System.out.println("Array {'j','a','v','a'} as 'java'");
System.out.println(String.valueOf(arr));

//codePointAt()
System.out.println("\n11.codePointAt() method");
String s24= "Sheetal";
int result = s24.codePointAt(0);
System.out.println("Unicode value at 0 :"+result);

//endsWith()
System.out.println("\n12.endswith()method");
String s15= "sheetal";
System.out.println("Is 'sheetal' ends with 'l' : "+s15.endsWith("l"));  
System.out.println("Is 'sheetal' ends with 'le': "+s15.endsWith("le"));   
System.out.println("Is 'sheetal' ends with 'sheetal' : "+s15.endsWith("sheetal")); 
 
//compareTo()
System.out.println("\n13.compareTo() method");
String s16="sheetal";
String s17="sheetal";
String s18="Sheetal";
String s19="";   String s20="";
System.out.println("Comparing sheetal and sheetal :"+s16.compareTo(s17));
System.out.println("Comparing sheetal and Sheetal :"+s16.compareTo(s18));
System.out.println("Comparing sheetal and empty string :"+s16.compareTo(s19));
System.out.println("Comparing Empty Strings "+s19.compareTo(s20));

//lastIndexOf
System.out.println("\n14.lastIndexOf() method");
String s22="Java programming";
int ind=s22.lastIndexOf('J');
System.out.println("'J' index from last in Java Programming : "+ind);
//it will search area before 6
int i1=s22.lastIndexOf('m',6);
System.out.println("'m' index before index 6 in java programming : "+i1);

//isEmpty()
System.out.println("\n15.isEmpty() methods");
String s4="";
System.out.println("Is s4='' variable empty :"+s4.isEmpty());

//split()
System.out.println("\n16.split() methods");
String week= "Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday";
String[] names=week.split(","); 
System.out.println("Spliting with commas");  
for(String element:names) {
System.out.println(element);}
//split() with limit
System.out.println(" spliting with space and limit is 3");  
String s21="Hello everyone sheetal verma here";   
for(String w:s21.split(" ",3))
{  
System.out.println(w);  
} 

//intern()
System.out.println("\n17.intern() methods");
//Create in Heap
String s11=new String("sheetal");
//Create in String Constant Pool
String s12="sheetal"; 
System.out.println("Before intern()method :");
//false because s13 point to "sheetal" of heap and s12 is of scp
String s14=s11;
System.out.println("s14='sheetal' point to heap 'sheetal' and s12 point to scp 'sheetal'");
System.out.println("So s14==s12 is :"+s14==s12);
System.out.println("After intern()method :");
//true because s13 and s12 both points to "sheetal of scp"
String s13=s11.intern();
System.out.println("s13='sheetal' and s12='sheetal' both point to heap 'sheetal'");
System.out.println("So s13==s12 is :"+s13==s12);
}
}