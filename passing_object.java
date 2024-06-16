//Passing object as parameter
class passing_object
{
    int a=10;
    public static void main(String args[])
    {
        passing_object object=new passing_object();

        System.out.println("Before change a is :"+object.a);
        
        change(object);
        
        System.out.println("After change a is :"+object.a);
    }
    static void change(passing_object obj)
    {
        obj.a=30;
    }
}
/*It is clear from the output that when we pass object 
and try to modify the original value using object,the 
original value get modify .. 