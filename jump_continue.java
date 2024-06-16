//Continue statement
class  jump_continue
{
    public static void main(String args[])
    {
       
        for(int j=1;j<=10;j++)
        {
        System.out.println(j);
        if(j==5)
        {
        System.out.println("**continue statement occur**");
        continue;
        }
        }
    }
}