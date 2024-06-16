//**Program to demonstrat 2D array**//
import java.util.*;
class array_2D{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int rows=sc.nextInt();
        System.out.println("Enter number of columns :");
        int column=sc.nextInt();
        int numbers[][]=new int[rows][column];
        for(int i=0;i<rows;i++)
        {
        System.out.println("Enter elements in row :"+i);
            for(int j=0;j<column;j++)
            {
                numbers[i][j]=sc.nextInt();
            }
        }
         System.out.println("***2D array ***");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(numbers[i][j]+" ");
            }System.out.println(" ");}}}//for new line
       
    