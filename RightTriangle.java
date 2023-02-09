import java.util.Scanner;

class RightTriangle{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the number=");

int rows = sc.nextInt();

for(int i=1; i <=rows; i++)
{
      for (int j=0; j< rows-1;j++)
      {
             System.out.println("");
      }
      for(int k=0; k<i; k++)
      {
             System.out.println("*");
      }
      System.out.println();
}
}
}