/*class KeywordStatic
{
    
    static int a=20;
    int b=30;
    void show1()
    {
      System.out.println(b);
      System.out.println(a);
    }
    static void show2()
    {
      System.out.println(b);
    }
  static
  {
    System.out.println("static block 1");
  }  
 
}
class Static
{
public static void main(String a[])
{
KeywordStatic k=new KeywordStatic();
k.show1();

}
}*/
 class KeywordStatic
{
 static int a=20;
static class inner
{
static void show()
{
  System.out.println("hello");
  System.out.println(a);
}
}
}
class Static
{
  public static void main(String a[])
  {
   KeywordStatic.inner i=new KeywordStatic.inner();
   i.show();
  
  }
}