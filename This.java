/*
//1 .this to refer instance variables
class thisKeyword
{
   String name="user";
    void show(String name)
    {
    System.out.println("ypur default name "+this.name);
    
    System.out.println("Your name : "+name);
    }
}
class This{
    public static void main(String a[])
    {
        thisKeyword reference=new thisKeyword(); 
         reference.show("sheetal");
    }
}*/
/*
//2. this to call currect class methods
class superClass
{
void show()
{
    System.out.println("super class");
}
void display()
{
    show();
}

}
class subClass extends superClass
{
void show()
{
    System.out.println("sub class");
    
}

}
class This
{
public static void main(String a[])
{
subClass s=new subClass();
s.display();

}
}*/
//3 .this to call constructor
/*class superClass
{  
superClass()
{
    System.out.println("Non parametrized constructor");
}  
superClass(String name)
{  
 this(); 
System.out.println("Hello : "+name);  
}  
}  
class This
{  
public static void main(String args[])
{  
superClass a=new superClass("sheetal");  
}
}*/
/*//4.returing this
class superClass
{
    void show()
    {
        System.out.println("super class");
    }
    superClass display()
    {
        return this;
    }
}
class This
{  
public static void main(String args[])
{  
superClass a=new superClass();  
//a.display().show();
superClass s=a.display();
s.show();
}}*/
//5. this as method parameter
class superClass
{
String name;
superClass(String n)
{
    name=n;
    System.out.println("original name :"+name);
    get(this);
}
void get(superClass s)
{
 System.out.println("copied name :"+s.name);
}
}
class This
{
public static void main(String args[])
{  
superClass a=new superClass("sheetal");  
} 
}