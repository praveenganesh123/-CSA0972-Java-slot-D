import java.util.*;
import java.io.*;

class matrixadd
{
public static void main(String args[])
{

int m,n,c,d;

Scanner sc = new Scanner(System.in);

System.out.println("Enter the number of row and columns 0f matrix=");

m = sc.nextInt();
n = sc.nextInt();

int first[][]=new int[m][n];
int second[][]= new int[m][n];
int sum[][]= new int[m][n];

System.out.println("enter the first matrix:");

System.out.println("Enter the number first matrix:");

for(c=0;c<m;c++)
for(d=0;d<n;d++)
first[c][d]= sc.nextInt();

System.out.println("Enter the number second matrix:");

for(c=0;c<m;c++)
for(d=0;d<n;d++)
second[c][d]= sc.nextInt();

for(c=0;c<m;c++) 
for(d=0;d<n;d++)
sum[c][d]=first[c][d]+second[c][d];
System.out.println("sum of the matrix :");

for(c=0;c<m;c++)
{
for(d=0;d<n;d++)
System.out.println(sum[c][d] + "\n");

System.out.println();
}
}
}



