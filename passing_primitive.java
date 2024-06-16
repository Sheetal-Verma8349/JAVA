//Passing primitive data type into method 
//swapping two numbers using user define method
class passing_primitive
{
    public static void main(String args[])
    {
        int a=10,b=20;
        System.out.println("value of a before swap :"+a);
        System.out.println("value of b before swap :"+b);
        swap(a,b);
        System.out.println("value of a after swap :"+a);
        System.out.println("value of b after swap :"+b);

    }
    static void swap(int n1,int n2)
    {
    int z;
    z=n1;
    n1=n2;
    n2=z;
    }}
/**It is clear from the output that there is no change in 
 original value when we modify the value in swap()method**/
