//return statement
class jump_return
{
    public static void main(String args[])
    {
    int a=10,b=20;
    int answer;
    answer=sum(a,b);
    System.out.println("Sum is :"+answer);
    show();
    }
    public static int sum(int a,int b)
    {
        int sum=a+b;
        //return with value
        return sum;
    }
    public static void show()
    {
        System.out.println("Sheetal Verma");
        //return without value
        return;
    }
}