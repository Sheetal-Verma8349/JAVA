class hcf
{
    //user define method to find highest common factor
    public static void main(String args[])
    {
        int n1=35;
        int n2=70;
        int result=find_hcf(n1,n2);
        System.out.println("HCF is : "+result);
    }
    static int find_hcf(int n1,int n2)
    {
        int factor=1;
        int limit=((n1<n2)?n1:n2);
        for(int i=2;i<=limit;i++)
        {
        if(n1%i==0 && n2%i==0)
        {
            factor=i;
        }   
       }
        return factor;
    }
}