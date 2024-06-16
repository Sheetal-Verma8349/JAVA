//Passing variable arguments
class variable_argument
{
    public static void main(String args[])
    {
    display(1,"Sheetal","Sambhav","Sakshi","Parag","Radhika","Palkesh");
    }

    static void display(int start,String...s)
    {
        
    System.out.println("Names are :");  

    for(int i=0;i<s.length;i++)
    {
        System.out.println(start+" :" +s[i]);
        start++;
    }

    }
}