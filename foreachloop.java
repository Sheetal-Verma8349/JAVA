class foreachloop
{
    public static void main(String args[] )
    {
    // Array of strings
    String students[] = {"Sheetal","Riya","Jiya","Tiya"};
    for(String element: students) 
    {
    System.out.println(element);
    } 
    
    // Array of intergers
    int marks[] = {30,70,80,50};
    for(int i=0;i<marks.length;i++) 
    {
    System.out.println(marks[i]++);
    } 
    for(int element: marks) 
    {
    System.out.println(element);
    } 
}}