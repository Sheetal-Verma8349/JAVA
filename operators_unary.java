class operators_unary{
    public static void main(String args[]){
        int a=10,d=20,e=30,f=40,g,h,b,c,p=50,k=60;
        boolean t=true;
        //INCREMENT OPERATOR
        b=a++;//post increment
        System.out.println("b = "+b);//first b assign 10
        c=++d;//pre increment
        System.out.println("c ="+c);//instantly increment c
        //DECREMENT OPERATOR
        g=e--;//post decrement
        System.out.println("g = "+g);//first g assign 30
        h=--f;//pre decrement
        System.out.println("h = "+h);//instantly decrement f

        //NOT OPERATOR !
        System.out.println("t's NOT= "+!t);
        System.out.println(!(a<k));

        //UNARY MINUS -
        System.out.println("k unary minus :"+-k);

        //BITWISE OPERATOR ~
        System.out.println("p's bitwise complement :"+~p);
        
        int n1=30;
        int n2=10;
        System.out.println(n1%n2);}}