class StringBuilderMethods
{
public static void main(String a[])
{
//append method  
System.out.println("\n 1. append()");  
StringBuilder s1=new StringBuilder("sheetal");
s1=s1.append(5.6);
System.out.println("After appending 5.6 in 'sheetal' new string is :"+s1);

//replace method
System.out.println("\n 2. replace()");  
StringBuilder s2=new StringBuilder("shital");
s2=s2.replace(0,3,"Shee");
System.out.println("After replacing 'shi' with 'shee' in 'shital' new string is : "+s2);

//getchars() method
System.out.println("\n 3. getchars()");  
StringBuilder s3= new StringBuilder("Hellosheetal");
char charArray[] = new char[s3.length()];
//here last 5 means i wants to store char from index 5 in array
s3.getChars(5, s3.length(), charArray, 5);       
for(int i=0;i<charArray.length;i++)
{
System.out.println("index "+i+" "+charArray[i]);
}

//trimToSize();
System.out.println("\n 4. trimToSize()");
StringBuilder s4= new StringBuilder("Hellosheetal");
System.out.println("Before trimToSize method old size : "+s4.capacity());
s4.trimToSize();
System.out.println("After trimToSize method new size :"+s4.capacity());
}
}