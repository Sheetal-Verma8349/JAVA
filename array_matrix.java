import java.util.*;
class array_matrix
{
public static void main(String args[]){
int i1=0,j1=0,i2=0,j2=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of rows first matrix :");
int rows1=sc.nextInt();
System.out.println("Enter number of columns first matrix:");
int column1=sc.nextInt();
int matrix1[][]=new int[rows1][column1];
System.out.println("Enter elements in matrix first");
for(i1=0;i<rows1;i1++)
{
//System.out.println("Enter elements in row :"+i);
for(j1=0;j1<column1;j1++)
{
matrix1[i1][j1]=sc.nextInt();
}
}
System.out.println("\nFirst matrix is : ");
for(i1=0;i1<rows1;i1++)
{
for(j1=0;j1<column1;j1++)
{
System.out.print(matrix1[i1][j1]+" ");
}
System.out.println(" ");}

//matrix 2
System.out.println("Enter number of rows in second matrix :");
int rows2=sc.nextInt();
System.out.println("Enter number of columns insecond matrix:");
int column2=sc.nextInt();
int matrix2[][]=new int[rows2][column2];
System.out.println("Enter elements in matrix second");
int matrix2[][]=new int[rows2][column2];
for(i2=0;i2<rows2;i2++)
{
//System.out.println("Enter elements in row :"+i);
for(j2=0;j2<column2;j2++)
{
matrix2[i2][j2]=sc.nextInt();
}
}
System.out.println("\nSecond matrix is : ***");
for(i2=0;i2<rows2;i2++)
{
for(j2=0;j2<column2;j2++)
{
System.out.print(matrix2[i2][j2]+" ");
}System.out.println(" ");
}
//addition for two matrix
System.out.println("\n  Addition  matrix is :  ");
for(i=0;i<rows;i++)
{
for(j=0;j<column;j++)
{
System.out.print(matrix1[i][j]+matrix2[i][j]+" ");
}System.out.println(" ");
}

//Subtraction for two matrix
System.out.println("\n   Subtraction  matrix is :   ");
for(i=0;i<rows;i++)
{
for(j=0;j<column;j++)
{
System.out.print(matrix1[i][j]-matrix2[i][j]+" ");
}System.out.println(" ");
}

//Multiplication for two matrix
System.out.println("\n   Multiplication  matrix is :  ");
for(i=0;i<rows;i++)
{
for(j=0;j<column;j++)
{
System.out.print(matrix1[i][j]*matrix2[i][j]+" ");
}System.out.println(" ");
}
}}
       
            
       
    