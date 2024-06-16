class conditional_if_else
{
    public static void main(String args[])
    {
        int age=14;
        if(age>18)
        {
            System.out.println("Eligible to vote");
        }
        /*Following code will show compile time error
        because else must preceeded by if
        int a=90;
        System.out.println(a);
        */
       else
        {
            System.out.println("Not Eligible to vote");
        }
    }
}