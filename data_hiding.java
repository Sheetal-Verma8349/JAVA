class data_hiding
{
    public static void main(String args[])
    {
        Rectangle r=new Rectangle();
        r.setLength(20);
        r.setBreadth(10);
        System.out.println("area is :"+r.area());
    }
}
class Rectangle 
{
    private int length;
    private int breadth;
    public int getLength()
    {
        return length;
    }
    public int getBreadth()
    {
        return breadth;
    }
    public void setLength(int l)
    {
        length=l;
    }
    public void setBreadth(int b)
    {
        breadth=b;
    }
    public int area()
    {
        return length*breadth;
    }
} 