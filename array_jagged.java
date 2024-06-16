import java.util.*;
class array_jagged{   
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number of rows");
       int rows=sc.nextInt();
       int arr[][] = new int[rows][];
       for(int i=0;i<rows;i++){
       System.out.println("Enter number of elements in row "+i);
       int size=sc.nextInt();
       arr[i]=new int[size];}
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter "+arr[i].length+" elements");
            for (int j = 0; j < arr[i].length; j++){
            int element=sc.nextInt();    
            arr[i][j] = element;}
        } 
        System.out.println("*** 2D Jagged Array ***");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            System.out.print(arr[i][j] + " ");
            System.out.println();}}}
