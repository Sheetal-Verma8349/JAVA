//Format() method in java
class string_format
{
    public static void main(String a[])
    {
    String name="Sheetal";
    int age=25;
    String s=String.format("Your name is %s and your age is %d",name,age);
    System.out.println(s);

    String s1 = String.format("%10d", age); 
    System.out.println(s1);
    String s2 = String.format("%010d", age); 
    System.out.println(s2);


    }
}