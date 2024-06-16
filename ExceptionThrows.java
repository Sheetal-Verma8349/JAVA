class Negative extends Exception
{
    public String toString()
    {
        return "negative dimension exception";
    }
}
class ExceptionThrows
{
    static int area(int l,int b) throws Negative
    {
        if(l<0 || b<0) 
        {
        throw new Negative();}
    return l*b;
    }
    static void meth2() throws Negative
    {
       System.out.println("Area is "+area(10,5));
    }
    
    public static void main(String a[])
    {
        try{
meth2();
        }
        catch(Negative e)
        {
            System.out.println(e);
        }
    }
}