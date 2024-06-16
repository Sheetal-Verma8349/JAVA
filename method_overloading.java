class method_overloading  {
    public static void main(String args[]){
    int l=20,b=10,side=5,l1=30,b2=10;
    float radius=7,b1=9.2f,l2=5.5f;
    area(l,b); 
    area(side);
    area(radius); 
    area(l1,b1);   
    area(l2,b2);}
    
    static void area(int l,int b){
    System.out.println("Area of rectangle is :"+l*b);}

    static void area(int side){
    System.out.println("Area of square is :"+side*side); }

    static void area(float radius) {
    System.out.println("Area of circle is :"+2*3.14*radius);}

    static void area(int l1,float b1) {
    System.out.println("Area of rectangle is :"+l1*b1); }

    static void area(float l2,int b2) {
    System.out.println("Area of rectangle is :"+l2*b2); } }
   