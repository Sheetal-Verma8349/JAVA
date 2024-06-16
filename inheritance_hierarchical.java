//Hierarchical Inheritance
class Super_class
{
void super_class_method()
{
System.out.println("Super class method");
}
}
class Sub_class1 extends Super_class
{
void sub_class1_method()
{
System.out.println("Sub class 1 method");
}
}
class Sub_class2 extends Super_class
{
void sub_class2_method()
{
System.out.println("Sub class 2 method");
}
}
class inheritance_hierarchical
{
public static void main(String args[])
{
Sub_class1 reference1=new Sub_class1();
Sub_class2 reference2=new Sub_class2();
        
reference1.sub_class1_method();
reference1.super_class_method();
reference2.super_class_method();
reference2.sub_class2_method();
}
}
/*using reference of derived class 
we can call properties & methods of 
super class as well as of 
the same class (derived class)*/