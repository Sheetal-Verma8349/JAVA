class String_equals_methods
{

    public static void main(String args[])
    {

    String s1=new String("Sheetal");
    String s2=new String("Sheetal");
    System.out.println(s1==s2);

    String s3="verma";
    String s4="verma";
    System.out.println(s3==s4);

    String s5="Sheetal";
    System.out.println(s1==s5);
    /*it return false because s1 points heap "Sheetal"
    and s5 points to SLP "Sheetal"
    */
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s5));


    }
}